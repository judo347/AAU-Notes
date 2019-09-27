#ifndef COMMUNICATOR_LOOP_FUNCTIONS_H
#define COMMUNICATOR_LOOP_FUNCTIONS_H

#include <argos3/core/simulator/loop_functions.h>
#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <controllers/alibot/alibot.h>
#include <argos3/core/control_interface/ci_controller.h>
#include <argos3/core/utility/math/vector2.h>

#include <list>

using namespace argos;

class CommunicatorLoopFunctions : public CLoopFunctions {

public:

   CommunicatorLoopFunctions();
   virtual ~CommunicatorLoopFunctions();

   virtual void Init(TConfigurationNode& t_tree);

   virtual void PreStep();

   virtual void PostStep();

private:

   /* A list for all controllers */
   std::list<Alibot*> botControllers;

   /* All destinations not handed out to controllers */
   std::list<CVector2> destinations;

   /* Delegates destinations to controllers that is available. */
   void DelegateDestinations();

   /* Find and collects all foot-bot controllers.
    * (Only works with alibots) */
   void CollectBotControllers();
};

#endif