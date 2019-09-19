#include kuntz.h

/* Function definitions for XML parsing. */
#include <argos3/core/utility/configuration/argos_configuration.h>
/* 2D vector definition. */
#include <argos3/core/utility/math/vector2.h>

/******************************/


//TODO
KBot::KBot() :
    m_pcWheels(NULL),
    m_pcProximity(NULL),
    m_cAlpha(10.0f),
    m_fDelta(0.5f),
    m_fWheelVelocity(2.5f),
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
}

void KBot::ControlStep(){
    //TODO Movement
    
}

REGISTER_CONTROLLER(KBot, "KBot_controller")