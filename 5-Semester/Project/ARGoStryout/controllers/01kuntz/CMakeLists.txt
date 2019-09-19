add_library(kbot MODULE kuntz.h kuntz.cpp)
target_link_libraries(kbot
  argos3core_simulator
  argos3plugin_simulator_footbot
  argos3plugin_simulator_genericrobot)