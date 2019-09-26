#ifndef COMMUNICATOR_LOOP_FUNCTIONS_H
#define COMMUNICATOR_LOOP_FUNCTIONS_H

#include <argos3/plugins/simulator/visualizations/qt-opengl/qtopengl_user_functions.h>
#include <argos3/plugins/robots/foot-bot/simulator/footbot_entity.h>

using namespace argos;

class CommunicatorLoopFunctions : public CQTOpenGLUserFunctions {

public:

   CommunicatorLoopFunctions();

   virtual ~CommunicatorLoopFunctions() {}

   void Draw(CFootBotEntity& c_entity);
   
};

#endif