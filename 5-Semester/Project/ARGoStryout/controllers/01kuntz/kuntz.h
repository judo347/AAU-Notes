#ifndef FBOT_H
#define FBOT_H

/* Include some necessary headers. */
/* Definition of the CCI_Controller class. */
#include <argos3/core/control_interface/ci_controller.h>
/* Definition of the differential steering actuator */
#include <argos3/plugins/robots/generic/control_interface/ci_differential_steering_actuator.h>
/* Definition of the foot-bot proximity sensor */
#include <argos3/plugins/robots/foot-bot/control_interface/ci_footbot_proximity_sensor.h>

/* You save typing argos:: ever time. */
using namespace argos;

/* A controller is simply an implementation of the CCI_Controller class. */
class KBot : public CCI_Controller {
public:

    /* Contructor */
    KBot();

    /* Destructor */
    virtual ~KBot(){}

    /* Initializes controller */
    virtual void Init(TConfigurationNode& t_node);

    /* Called each step */
    virtual void ControlStep();

    /* Called when reset is pressed in the GUI */
    virtual void Reset(){}

    /* Cleanup method */
    virtual void Destroy(){}

private:

    /* Pointer to the differential steering actuator */
   CCI_DifferentialSteeringActuator* m_pcWheels;
   /* Pointer to the foot-bot proximity sensor */
   CCI_FootBotProximitySensor* m_pcProximity;

   /*
    * The following variables are used as parameters for the
    * algorithm. You can set their value in the <parameters> section
    * of the XML configuration file, under the
    * <controllers><footbot_diffusion_controller> section.
    */

   /* Maximum tolerance for the angle between
    * the robot heading direction and
    * the closest obstacle detected. */
   CDegrees m_cAlpha;
   /* Maximum tolerance for the proximity reading between
    * the robot and the closest obstacle.
    * The proximity reading is 0 when nothing is detected
    * and grows exponentially to 1 when the obstacle is
    * touching the robot.
    */
   Real m_fDelta;
   /* Wheel speed. */
   Real m_fWheelVelocity;
   /* Angle tolerance range to go straight.
    * It is set to [-alpha,alpha]. */
   CRange<CRadians> m_cGoStraightAngleRange;
}