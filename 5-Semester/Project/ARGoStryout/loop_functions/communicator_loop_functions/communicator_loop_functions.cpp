#include "communicator_loop_functions.h"

#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <argos3/core/utility/logging/argos_log.h>
#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <controllers/alibot/alibot.h>

#include <list>

/****************************************/

CommunicatorLoopFunctions::CommunicatorLoopFunctions() {
}

CommunicatorLoopFunctions::~CommunicatorLoopFunctions(){

}

/****************************************/
/****************************************/

void CommunicatorLoopFunctions::Init(TConfigurationNode& t_tree){
   //TODO
   SetBotController();
}

void CommunicatorLoopFunctions::PreStep(){
}

/*
void CommunicatorLoopFunctions::RobotCheckIn(CFootBotEntity& bot){
   argos::LOG << "Communicator: A robot has checked-in!" << std::endl;
   botController = bot;
}*/

void CommunicatorLoopFunctions::SetBotController(){
   
   /* Get a map containing all active foot-bots */
   CSpace::TMapPerType& botMap = GetSpace().GetEntitiesByType("foot-bot");
   argos::LOG << "Number of foot-bots: " << botMap.size() << std::endl;

   /* Initialize array size to match the number of bots */
   //Alibot array[botMap.size()];
   //botController = array;

   /* Iterate through all bots and collect their controller */
   for(CSpace::TMapPerType::iterator it = botMap.begin(); it != botMap.end(); it++){
      CFootBotEntity& cFootbot = *any_cast<CFootBotEntity*>(it->second);
      Alibot& controller = dynamic_cast<Alibot&>(cFootbot.GetControllableEntity().GetController());
      botControllers.push_back(controller); //Put it a the end of the list
   }

   argos::LOG << "Number of controllers: " << botControllers.size() << std::endl;
}
/****************************************/
/****************************************/

REGISTER_LOOP_FUNCTIONS(CommunicatorLoopFunctions, "communicator_loop_functions");