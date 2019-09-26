#include "communicator_loop_functions.h"

#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>

/****************************************/

CommunicatorLoopFunctions::CommunicatorLoopFunctions() {
}

CommunicatorLoopFunctions::~CommunicatorLoopFunctions(){

}

/****************************************/
/****************************************/

void CommunicatorLoopFunctions::Init(TConfigurationNode& t_tree){
   //TODO
}

/****************************************/
/****************************************/

REGISTER_LOOP_FUNCTIONS(CommunicatorLoopFunctions, "communicator_loop_functions");