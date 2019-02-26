## Lecture 2 - Threads and Processes

### Process

Thread: Least executable program

Process: The environment a program is executed in. A running program with all concomitant data (This also includes data that makes it "easy" to move around the process). A "virtual machine" but limited access e.g. processor (cannot send halt command) and isolated from other processes. All processes are isolated and will think that they have the whole computer to itself.

UNIX systems. Init-process / process 0. This process gets started when the OS is turned on. All other processes is directly started by this one or by other processes that is indirectly started by process 0.

When an interrupts happens, we switch from user-mode to kernel-mode. This is the only way to switch. INTERRUPTS: Clock interrupt, I/O interrupt, Memory fault. Every time you push a button on the keyboard there will be an interrupt send to the processer. Or when a file is opened. Memory fault can happen when asking for something that is not in the primary memory.

System calls is done through the API that the OS exposes to the programs.

The OS is not a process. The OS is a library that runs processes and instantiates things for processes.

Processes has 5 states as shown below. It is in the started state when you allocate memory for a process. When no processes is running the OS can start a process that clean or does other maintaining that is needed.   **THIS HAS TO BE MEMORIES FOR THE EXAM!!!!!!!**

![](.\img\1.png)

### Threads

Threads are faster when implemented in user-mode. The OS does not know anything about the threads a program is starting/running. 

Dynamic loaded library (DLL) is often used by different processes and is therefore run in a specerate thread. 

## Lecture 3 - Scheduling

