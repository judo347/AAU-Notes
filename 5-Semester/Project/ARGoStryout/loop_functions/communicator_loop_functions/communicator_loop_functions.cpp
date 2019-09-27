#include "communicator_loop_functions.h"

#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <argos3/core/utility/logging/argos_log.h>
#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>
#include <controllers/alibot/alibot.h>
#include <argos3/core/utility/math/vector2.h>

#include <list>
#include <iterator>

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

   /* Add destinations to destination list */
   destinations.push_back(CVector2(2,2));
   destinations.push_back(CVector2(-2,2));
   destinations.push_back(CVector2(-2,-2));
}

void CommunicatorLoopFunctions::PreStep(){

   //argos::LOG << "pre-step tick" << std::endl;
   DelegateDestinations();

}

void CommunicatorLoopFunctions::PostStep(){

   //argos::LOG << "post-step tick" << std::endl;
   //DelegateDestinations();

}

void CommunicatorLoopFunctions::DelegateDestinations(){
   //argos::LOG << "1" << std::endl;
   /* Iterate through all controls and check if bot is ready for a destination */
   std::list<Alibot>::iterator it; // = botControllers.begin();
   //argos::LOG << "2" << std::endl;

   //argos::LOG << "Number of conrolasdla: " << botControllers.size();

   //return;

   //while(it != botControllers.end()){
   for(it = botControllers.begin(); it != botControllers.end(); it++){
      //argos::LOG << "for tick" << std::endl;

      argos::LOG << "Coms: for: is ready: " << it->IsReadyForDestination() << std::endl;

      if(it->IsReadyForDestination()){

         argos::LOG << "Coms: bot is ready!" << std::endl;

         if(destinations.size() != 0){
            std::list<CVector2>::iterator itDest = destinations.begin();

            CVector2 dest = *itDest;
            destinations.pop_front();
            it->SetDestination(dest);
            argos::LOG << "Coms: gave dest!" << std::endl;
         }
      }
   }
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
      //controller.SetDestination(CVector2(5,5));
      botControllers.push_back(controller); //Put it a the end of the list
   }

   argos::LOG << "Number of controllers: " << botControllers.size() << std::endl;
}
/****************************************/
/****************************************/

REGISTER_LOOP_FUNCTIONS(CommunicatorLoopFunctions, "communicator_loop_functions");