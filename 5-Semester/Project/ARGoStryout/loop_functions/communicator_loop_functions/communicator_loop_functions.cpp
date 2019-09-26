#include "communicator_loop_functions.h"

#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <argos3/core/utility/logging/argos_log.h>
#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <controllers/alibot/alibot.h>

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

   /* Get the first foot-bot and its controller */
   CSpace::TMapPerType::iterator it = botMap.begin();
   CFootBotEntity& cFootbot = *any_cast<CFootBotEntity*>(it->second);
   //Alibot& controller = dynamic_cast<Alibot&>(cFootbot.GetControllableEntity().GetController());
   CCI_Controller& controller = dynamic_cast<CCI_Controller&>(cFootbot.GetControllableEntity().GetController());

   /* Set field and add THIS to bot controller */   
   //controller.AddCommunicator(*this);
   botController = &controller;
}
/****************************************/
/****************************************/

REGISTER_LOOP_FUNCTIONS(CommunicatorLoopFunctions, "communicator_loop_functions");