#include "kbot.h"

/* Function definitions for XML parsing. */
#include <argos3/core/utility/configuration/argos_configuration.h>
/* 2D vector definition. */
#include <argos3/core/utility/math/vector2.h>
/* Function definitions for logging */
#include <argos3/core/utility/logging/argos_log.h>

/******************************/

KBot::KBot() :
    m_pcWheels(NULL),
    m_pcProximity(NULL),
    m_cAlpha(10.0f),
    m_fDelta(0.5f),
    m_fWheelVelocity(5.0f),
    m_cGoStraightAngleRange(-ToRadians(m_cAlpha),
                            ToRadians(m_cAlpha)) {}


/******************************/

void KBot::Init(TConfigurationNode& t_node){

    //TODO Sensors and actuators
    m_pcWheels    = GetActuator<CCI_DifferentialSteeringActuator>("differential_steering");
    m_pcProximity = GetSensor  <CCI_FootBotProximitySensor      >("footbot_proximity"    );

    GetNodeAttributeOrDefault(t_node, "alpha", m_cAlpha, m_cAlpha);
    m_cGoStraightAngleRange.Set(-ToRadians(m_cAlpha), ToRadians(m_cAlpha));
    GetNodeAttributeOrDefault(t_node, "delta", m_fDelta, m_fDelta);
    GetNodeAttributeOrDefault(t_node, "velocity", m_fWheelVelocity, m_fWheelVelocity);

    isAdjustingDirection = false;

    /* SetDirection(new CVector3(1,1,0)); */
}

void KBot::ControlStep(){

    /* Get readings from proximity sesor */
   const CCI_FootBotProximitySensor::TReadings& tProxReads = m_pcProximity->GetReadings();

   /* Sum readings together */
   CVector2 cAccumulator;
   for(int i = 0; i < tProxReads.size(); i++){
        cAccumulator += CVector2(tProxReads[i].Value, tProxReads[i].Angle);
    }
    cAccumulator /= tProxReads.size();

    /* If the angle of the vector is small enough and the closest obstacle
     * is far enough, continue going straight, else pick a random direction */
    CRadians cAngle = cAccumulator.Angle();
    if(m_cGoStraightAngleRange.WithinMinBoundIncludedMaxBoundIncluded(cAngle) &&
        cAccumulator.Length() < m_fDelta ) {
        /* Go straight */
        m_pcWheels->SetLinearVelocity(m_fWheelVelocity, m_fWheelVelocity);
        isAdjustingDirection = false;
    }
    else {

	/* Are we currently adjusting the direction or do we need to find a new direction? */
        if(isAdjustingDirection){
	    m_pcWheels->SetLinearVelocity(m_fWheelVelocity, 0.0f);
        } else {
	    targetDirection = GetRandomDirection();
	    isAdjustingDirection = true;
	}
    }

    //TODO Movement
    // m_pcWheels->SetLinearVelocity(m_fWheelVelocity, m_fWheelVelocity);
    LOG << "TICK";
}

CVector2 KBot::GetRandomDirection(){

	int randNum1;
	int randNum2;

	srand((unsigned)time(0));

	randNum1 = (rand()%3)-1;
	randNum2 = (rand()%3)-1;

	CVector2 randomDirection;

	randomDirection = CVector2(randNum1, randNum2);

	return randomDirection;
}

REGISTER_CONTROLLER(KBot, "KBot_controller")
