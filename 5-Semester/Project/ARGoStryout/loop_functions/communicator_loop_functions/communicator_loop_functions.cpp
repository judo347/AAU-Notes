#include "communicator_loop_functions.h"

/****************************************/
/****************************************/

CommunicatorLoopFunctions::CommunicatorLoopFunctions() {
   RegisterUserFunction<CommunicatorLoopFunctions,CFootBotEntity>(&CommunicatorLoopFunctions::Draw);
}

/****************************************/
/****************************************/

void CommunicatorLoopFunctions::Draw(CFootBotEntity& c_entity) {
   /* The position of the text is expressed wrt the reference point of the footbot
    * For a foot-bot, the reference point is the center of its base.
    * See also the description in
    * $ argos3 -q foot-bot
    */
   DrawText(CVector3(0.0, 0.0, 0.3),   // position
            c_entity.GetId().c_str()); // text
}

/****************************************/
/****************************************/

REGISTER_QTOPENGL_USER_FUNCTIONS(CommunicatorLoopFunctions, "communicator_loop_functions")