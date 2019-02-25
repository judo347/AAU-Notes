# # Lecture 3

### XV6 Exercises

(2) Find the code where *process states* are defined

1. What states can processes be in; explain what each state means.

   - UNUSED: This state is for when the process has never been used.
   - EMBRYO: This process has been used and is given a pid. 
   - SLEEPING: When the cpu does not need to run this process. At some point wake() will be called and the sleeping process will be set to RUNNABLE.
   - RUNNABLE: A process that is ready to be run by the CPU.
   - RUNNING: A process that is currently being run by the CPU.
   - ZOMBIE:  An exited process remains in the zombie state until its parent calls wait() to find out it exited.

2. Would you prefer more/fewer process states?

   ....

3. 

