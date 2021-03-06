/* Include the controller definition */
#include "alibot.h"
/* Function definitions for XML parsing */
#include <argos3/core/utility/configuration/argos_configuration.h>
/* 2D vector definition */
#include <argos3/core/utility/math/vector2.h>
/* 3D vector definition */
#include <argos3/core/utility/math/vector3.h>
/* Quick maths */
#include <math.h> 
/* Enable logging */
#include <argos3/core/utility/logging/argos_log.h>

#include <loop_functions/communicator_loop_functions/communicator_loop_functions.h>

/****************************************/
/****************************************/

Alibot::Alibot() : m_pcWheels(NULL),
                                         m_pcProximity(NULL),
                                         m_cAlpha(10.0f),
                                         m_fDelta(0.5f),
                                         m_fWheelVelocity(2.5f),
                                         m_cGoStraightAngleRange(-ToRadians(m_cAlpha),
                                                                 ToRadians(m_cAlpha)) {}

/****************************************/
/****************************************/

void Alibot::Init(TConfigurationNode &t_node)
{
   /*
    * Get sensor/actuator handles
    *
    * The passed string (ex. "differential_steering") corresponds to the
    * XML tag of the device whose handle we want to have. For a list of
    * allowed values, type at the command prompt:
    *
    * $ argos3 -q actuators
    *
    * to have a list of all the possible actuators, or
    *
    * $ argos3 -q sensors
    *
    * to have a list of all the possible sensors.
    *
    * NOTE: ARGoS creates and initializes actuators and sensors
    * internally, on the basis of the lists provided the configuration
    * file at the <controllers><footbot_diffusion><actuators> and
    * <controllers><footbot_diffusion><sensors> sections. If you forgot to
    * list a device in the XML and then you request it here, an error
    * occurs.
    */
   m_pcWheels = GetActuator<CCI_DifferentialSteeringActuator>("differential_steering");
   m_pcProximity = GetSensor<CCI_FootBotProximitySensor>("footbot_proximity");
   m_pcPosSens = GetSensor<CCI_PositioningSensor>("positioning");
   /*
    * Parse the configuration file
    *
    * The user defines this part. Here, the algorithm accepts three
    * parameters and it's nice to put them in the config file so we don't
    * have to recompile if we want to try other settings.
    */
   GetNodeAttributeOrDefault(t_node, "alpha", m_cAlpha, m_cAlpha);
   m_cGoStraightAngleRange.Set(-ToRadians(m_cAlpha), ToRadians(m_cAlpha));
   GetNodeAttributeOrDefault(t_node, "delta", m_fDelta, m_fDelta);
   GetNodeAttributeOrDefault(t_node, "velocity", m_fWheelVelocity, m_fWheelVelocity);

   //isReadyForDestinationReady = true;
}

/****************************************/
/****************************************/

void Alibot::ControlStep()
{
   argos::LOG << std::endl << "Alibot control: before if. Is ready: " << isReadyForDestinationReady << "target direction: " << targetDirection << std::endl;

   if(isReadyForDestinationReady){
      return;
   }

   argos::LOG << "Alibot control: after if" << std::endl;

   /* Get readings from proximity sensor */
   const CCI_FootBotProximitySensor::TReadings &tProxReads = m_pcProximity->GetReadings();

   argos::LOG << m_pcPosSens->GetReading().Position << std::endl;

   /* If the angle of the vector is small enough and the closest obstacle
     * is far enough, continue going straight, else pick a random direction */
   CRadians cZAngle, cYAngle, cXAngle;

   m_pcWheels->SetLinearVelocity(m_fWheelVelocity, -m_fWheelVelocity);
   m_pcPosSens->GetReading().Orientation.ToEulerAngles(cZAngle, cYAngle, cXAngle);
 
   argos::LOG << "z angle: " << cZAngle << std::endl;

   int frontAngle = ToDegrees(cZAngle).GetValue();
   int targetAngle = targetDirection.Angle().GetValue() * 57.2958;

   //argos::LOG << "Front = " << frontAngle << std::endl;
   //argos::LOG << "Target = " << targetAngle << std::endl;

   //CVector2 frontVector = CVector2(m_pcPosSens->GetReading().Orientation.GetX(), m_pcPosSens->GetReading().Orientation.GetY());

   //argos::LOG << "\nFrontvector = " << frontVector << "\n" << std::endl;

   if (((targetAngle - frontAngle) > -2) && ((targetAngle - frontAngle) < 2))
   {
      m_pcWheels->SetLinearVelocity(m_fWheelVelocity, m_fWheelVelocity);
   }

   float xDif = targetDirection.GetX() - m_pcPosSens->GetReading().Position.GetX();
   float yDif = targetDirection.GetY() - m_pcPosSens->GetReading().Position.GetY();

   if ( abs(sqrt(pow(xDif, 2) + pow(yDif,2))) < 0.02 )
   {
      m_pcWheels->SetLinearVelocity(m_fWheelVelocity, -m_fWheelVelocity);
   }
}

void Alibot::SetDestination(CVector2 destVec){
   targetDirection = CVector2(destVec.GetX(), destVec.GetY());
   argos::LOG << "Alibot: got destination: " << destVec << " target : " << targetDirection << std::endl;
   isReadyForDestinationReady = false;
}

/*
void Alibot::AddCommunicator(CommunicatorLoopFunctions& clf_incoming){
   argos::LOG << "Alibot: A communicator has been added!" << std::endl;
   clf = &clf_incoming;
}*/

/****************************************/
/****************************************/

/*
 * This statement notifies ARGoS of the existence of the controller.
 * It binds the class passed as first argument to the string passed as
 * second argument.
 * The string is then usable in the configuration file to refer to this
 * controller.
 * When ARGoS reads that string in the configuration file, it knows which
 * controller class to instantiate.
 * See also the configuration files for an example of how this is used.
 */
REGISTER_CONTROLLER(Alibot, "Alibot_controller")