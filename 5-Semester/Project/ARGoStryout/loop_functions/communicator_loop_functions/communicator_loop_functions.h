#ifndef COMMUNICATOR_LOOP_FUNCTIONS_H
#define COMMUNICATOR_LOOP_FUNCTIONS_H

#include <argos3/core/simulator/loop_functions.h>

using namespace argos;

class CommunicatorLoopFunctions : public CLoopFunctions {

public:

   CommunicatorLoopFunctions();
   virtual ~CommunicatorLoopFunctions();

   virtual void Init(TConfigurationNode& t_tree);

};

#endif