## Lecture 3

### XV6 Exercises

(2) Find the code where *process states* are defined

1. What states can processes be in; explain what each state means.

   - UNUSED: This state is for when the process has never been used. = Empty slot in the process table. This mean that all data in this slot is not valid/useful.
   - EMBRYO: This process has been used and is given a pid. 
   - SLEEPING: When the cpu does not need to run this process. At some point wake() will be called and the sleeping process will be set to RUNNABLE.
   - RUNNABLE: A process that is ready to be run by the CPU.
   - RUNNING: A process that is currently being run by the CPU.
   - ZOMBIE:  An exited process remains in the zombie state until its parent calls wait() to find out it exited.

2. Would you prefer more/fewer process states?

   ....

3. 

## Lecture 5

### Exercises from OSTEP

**1) Compute the response time and turnaround time when running three jobs**
**of length 200 with the SJF and FIFO schedulers**.

$T_{turnaroundtime} = T_{completion} - T_{arrival}$

$T_{response} = T_{firstrun} - T_{arrival}$

FIFO: 

- turnaroundtime should be: 200 + 200 + 200 = 600. Average is 200.
- response: 0, 200 and 400. Average is 333,33.

SJF (Shortest job first):

- Has the same values as the above FIFO because all jobs has the same length.

**2) Now do the same but with jobs of different lengths: 100, 200, and 300.**

FIFO:

- Turnaroundtime: 100 + 200 + 300 = 600. Average is 200.
- Response: 