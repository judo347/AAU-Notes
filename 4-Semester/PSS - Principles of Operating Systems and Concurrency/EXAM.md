**Re-exam**

Make sure that there are a drawing for each topic and practice with that drawing as the centre of discussion!!!!!!!!!!!

Udskriv keywords!!



<https://www.youtube.com/watch?v=lIZN6UgoxOc&list=PLpYYmFbxbA1ofkOY3or5ysqBKYBdAuZ6S&index=2>

Indian vids, nået til: 17

Skipped 6... ok?! 11

Skipped: 

- 9: 12:22-> rest (page tables)
- 14: 3 -> rest (implementation of race conditions (monitors))

## Question 1: Processes and threads

#### Definition of process/thread

A running program and all its data. A given process has: 

- A unique identifier (PID)
- Memory image (Code and data (static), and stack and heap (dynamic))
- CPU Context: registers (program counter, current operands, strack pointer)
- File descriptors (pointers to open files and devices).

#### process-/thread-control block

The contains a list of process control blocks - one for each process. 

The PCB contains:

- Process identifier
- Process state
- Pointers to other related processes (parent)
- CPU context of the process (saved when the process is suspended)
- Pointers to memory locations
- Pointers to open files

Each PCB has one or more linked TCB (threads).

#### 5-state process model

- Running: currently executing on CPU
- Ready: waiting to be scheduled
- Blocked: suspended, not ready to run
  - Why? Waiting for some event, e.g., process issues a read from disk.
  - When is it unblocked? Disk issues an interrupt when data is ready.
- New: being created, yet to run.
- Dead: terminated.

![](.\img\1.png)

#### process creation

Done by the OS. 

- Allocates memory and creates memory image. (Loads code, data from disk exe. Creates runtime stack and heap)
- Opens basic files (STD IN, OUT, ERR)
- Initializes CPU registers  (PC points to first instruction)

#### process image

**IS THIS WHAT IT IS: **Memory image (Code and data (static), and stack and heap (dynamic))

![](.\img\exam\2.png)

Program Code: This is things like static/global variables.

Heap is used for dynamic data structures. Can be done by calling malloc.

#### process/thread switching

Done by the CPU Scheduler. Save context (PC, registers, kernel stack pointer), switch SP to kernel stack of new process, restore context from new process.

This is also done for threads, which is linked to a PCB. Each PCB has one or multiple TCB's.

#### multithreading

Multi-threading: Multiple lines of execution though your code. A thread is like another copy of a process that executes independently. They share the program code, address space and heap, but each has its own program counter and their own stack with a stack pointer. Results in a smaller memory footprint.

Multi-threading is often used to maximize the usage of the CPU. So if one thread blocks the CPU, by doing I/O operations, another thread can use the CPU/core meanwhile.)

Kernel threads: are threads that are scheduled independently by the kernel.

#### implementation strategies for thread support

Implementation in kernel-space (aka. obvious choice)

- Modify/extend *kernel* to support threads
- Pro's: better handling of blocked threads

Implementation in user-space

- *User-space library* for thread creation, switching, termination ...
- Pro's: performance (kernel not involved), portable
- Con's: blocked threads

Hybrid: kernel-support for user-space threads (aka. complex choice)

- Mainly in user-space
- Mapping user-space threads to (fewer) kernel-space threads
- Pro's: all of the above
- Con's: complex implementation, complex management

#### user-/kernel-mode

Privilege levels. Function calls can be executed in user-mode but some instructions can only be made in kernel mode. If the privilege level is not met, the CPU will refuse to execute that command.

The kernel-mode has a separate stack, and the IDT for addresses.

At boot-time the kernel sets up Interrupt Descriptor Table (IDT) containing all addresses of all kernel functions.

MANGLER 7:15-16:33 Lecture 4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

## Question 2: Scheduling

**Notes/order**: <span style="color:pink">Two parts, metrics, simple process model, Scheduling policies.</span>

Has two parts: Policy to pick which process to run and mechanism to switch to that process.

Non-preemptive schedulers switch only when a process is blocked or terminated, and preemptive schedulers switch even when the process is ready to continue. CPU generates periodic timer interrupts and then the OS checks if the current process has run for too long.

#### Metrics for scheduling (turnaround time, response time)

Tries to optimize:

- Max: Utilization (Fraction of time CPU is used)
- Min average: Turnaround time (Time from process arrival to completion)
- Min average: Response time (Time from process arrival to first scheduling)
- Fairness: all processes must be treated equally
- Min Overhead: run process long to amortize cost of context switch (~1 microsecond)

#### simple process model

![](.\img\exam\1.png)

![](.\img\1.png)

#### scheduling policies (FIFO, SJF, STCF, Round Robin, MLFQ, lottery scheduler)

Approaches:

- FIFO: First in, first out / FCFS: Fist come, First Served.
  - Problems: turnaround times tend to be high: small processes can get stuck behind large ones.
- SJF: Shortest Job Frist
  - Problems: short jobs can still get stuck behind large ones by arriving after the large one starts to execute
- STCF: Shortest Time-to-Completion First / PSJF: Preemptive Shortest Job First
  - Problem: 
- Round Robin (Good for response time)
  - You go though all processes, one by one, and let them each run for a set period of time, and then repeat.
  - Problem: bad for turnaround time.
- MLFQ: Multi-level Feedback Queue (Chapter 8) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Måske lidt mere viden?
  - Many queues, in order of priority
  - Process from highest priority queue scheduled frist
  - Within same priority, any algorithm like RR
  - Priority of process decays with its age
- Lottery Scheduler
  - Each jobs gets a number of tickets and the scheduler then draws a random ticket at runs the matching job. Jobs can be granted a higher amount of tickets for a relative higher chance of selection.

## Question 3: Memory management

#### Memory hierarchy

- CPU registers:  <1 cycle
- Internal cache: 1 cycle
- Secondary (external) cache: 5 cycles
- Tertiary cache (if any): 10 cycles
- Physical memory: 25-50 cycles
- Swap disk and virtual memory: around 1.000.000 cycles

#### goals for memory management (transparency, efficiency, isolation)

- Transparency: user programs should not be aware of the messy details.
- Efficiency: minimize overhead and wastage in terms of memory space and access time.
- Protection (and isolation): a user process should not be able to access anything outside its address space.

#### address space

A virtual address space is an abstraction of a part of the physical memory. Goes from address 0 to a MAX.

#### challenges for memory management

#### features (relocation, protection, and sharing)

#### virtual addresses vs. physical addresses

The physical memory is your ram which is an array of bytes. This goes from 0KB to something. A virtual address is a physical one but has another address - is a part of a virtual address space.

#### address translation

Load and store instructions has to be converted from virtual addresses to physical addresses, this is done by the Memory Management Unit (MMU) and it uses information about the addresses from the OS. The MMU is a piece of hardware that is often (always) integrated into the CPU.  It is pretty simple: the virtual address space has a base KB, so the virtual address is just added to the base KB and it results in the actual physical address.

The MMU will generate faults and traps to OS when access is illegal (e.g., VA is out of bound)

Uses the base and bound registers.

#### base and bound registers

Base is the physical address corresponding to the virtual address 0 and the bound is the highest allowable virtual address.

#### simple allocation

#### static allocation (nonuniform)

#### dynamic allocation

#### virtual memory

A virtual address is a physical one but has another address - is a part of a virtual address space.

#### segmentation

Generalized base and bounds. Each segment of memory image (Program code, Heap, Stack) placed separately in the RAM. This results in multiple base and bound values: each segment has its own base and bound that is stored in the MMU.

This is good for sparse address spaces: can utilize small chucks of memory.

## Question 4: Paged memory

#### Address types (physical, relative, virtual)

- Physical: an address corresponding to a byte. This is the actual placement of the byte.
- Relative: is the offset to the base address. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! research the exact meaning.!!!!!!
- Virtual: an address that is calculated from a base register. This is a part of a memory image and can be translated into a physical address.

#### address translation (page tables)

A page table is used to store information about which pages is mapped to which frames. The MMU has access to the page table which is used to translate addresses (Virtual <-> physical). It is stores in the PCB (Process Control Block)

The data structure can be a map which maps from virtual page number to physical frame number.



**What happens on memory access?**

- CPU requests code or data at a virtual address
- MMU must translate VA to PA
  - First, access memory to read page table entry
  - Translate VA to PA
  - Then, access memory to fetch code/data
- Paging adds overhead to memory access
  - Solution: cache for VA-PA mappings called Translation Lookaside Buffer (TLB). This stores the recent translations of VA-PA.

#### virtual memory

A virtual address is a physical one but has another address - is a part of a virtual address space.

#### swapping

OS uses a part of the disk (swap space) to store pages that are not in active use. (Demand pages). If a page is trying to be accessed and is not in memory, the MMU will raise a trap to the OS - page fault. Then the OS moves the CPU to kernel mode. OS then fetches disk address of page and issues a read to disk. The read operation takes very long, so the current process is blocked and OS then makes a context switch to another process. When the disk read is completed, OS updates page table of process and marks it as ready. And the results the page fault and restarts the instruction that should now not raise a trap.

#### paging

The entire address space of a process is split into fixed size chucks called pages. The physical memory is split into fixed size chucks called frames. Then when allocating space for a page it will be allocated to a set of frames.

This is done to avoid small "holes" of free memory. By there might still be partially filled pages: if the system askes for a 4KB chuck and the size of frames is 4000KB.

**Page table entry (PTE)**

Each page has an entry, so the page table can be stores as an array. So a virtual page number would be an index into the array.

Page table entry contains:

- **Physical frame number**: where the page is stored in physical memory.
- Valid bit: is this page used by process?
- Protection bits: read/write permissions
- Present bit: is this page in memory?
- Dirty bit: has this page been modified?
- Accessed bit: has this page been recently accessed?

#### shared memory



#### memory use for OS

OS is not a separate process with its own address space. Instead, OS code is part of the address space of every process. A process sees the OS as a part of its code (like a library). 

There is only one OS with a set of physical memory but some mechanism insures that all processes has its own OS code/library that it can access.

The OS needs memory for its data structures. For large allocations, OS allocates a page. For smaller allocations, OS uses various memory allocation algorithms. (Cannot use libc and malloc in kernel!!) !!!!!!!!!!!!!!!!!!!!!!!ALGORITHEMS?!???????????????????????????????

#### page replacement algorithms (OPT, LRU, FIFO, CLOCK)

Policies:

- Optimal: replace page not needed for longest time in future (not practical!)
- FIFO: replace page that was brought into memory earliest (may be a popular page!)
- LRU/LFU: replace the page that was least recently (or frequently) used in the past
- CLOCK: !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



LRU: Uses the accessed bit set by the MMU. OS Periodically looks at this bit to estimate pages that are active and inactive. To replace, OS tries to find a page that does not have access bit set, and may also look for page with dirty bit not set (to avoid swapping out to disk).

## Question 5: Concurrency

#### Multi-threading

Multi-threading: Multiple lines of execution though your code. A thread is like another copy of a process that executes independently. They share the program code, address space and heap, but each has its own program counter and their own stack with a stack pointer. Results in a smaller memory footprint.

Multi-threading is often used to maximize the unage of the CPU. So if one thread blocks the CPU, by duing I/O operations, another thread can use the CPU/core meanwhile.)

Kernel threads: are threads that are scheduled independently by the kernel.

#### implementation strategies for multi-threading (concurrency)

#### concurrency vs. parallelism

- Concurrency: is when two or more tasks can start, run, and complete in overlapping time periods. It doesn't necessarily mean they'll ever both be running at the same instant. For example, multitasking on a single-core machine.

- Parallelism: is when tasks literally run at the same time, e.g., on a multicore processor. (Has to be over **multiple cores**. Or else it is concurrency.)

#### inter-process communication

They do not share anything as default. Very complex. Methods: Segment of shared memory, pipe or queue that you pass along.

#### race conditions

Explanation: When concurrent execution can lead to different results. Like if two threads add one  to a number, one loads the number, adds one and gets interrupted before being able to save. Then the other thread does the same and then both treads saves. This results in only one increment, but if one threads gets to fisish before the next, then the result is two increments.

#### mutual exclusion

This is the answer to race conditions. Used in a critical section of the code, so that only one thread can access the code at a time. So other threads will wait until the thread is done with that part of the come.

This is also called atomicity. The critical section should execute like one uninterruptiable instruction. 

#### ensuring mutual exclusion (algorithms, hardware supported, mutexes, semaphores, monitors)

Goals for lock implementation:

- Mutual exclusion.
- Fairness: all threads should eventually get the lock, and no thread should starve
- Low overhead: acquiring, releasing, and waiting for lock should not consume too many resources.



Methods of implementation:

- (sleeping) mutex: C implements it as lock_t. When writing code, you can then lock this lock, write critical section and then unlock the lock. So if the lock is locked when another thread tries to lock the lock, it has to wait. A mutex lock gives up the CPU while waiting for a lock to unlock.
- Hardware supported: a single hardware instruction. Since it is a single instruction it cannot be interrupted mid-way. 
  - spinlocks: These locks has to have a while-loop spin continuesly to check if the lock has been unlocked, and thereby wasting CPU usage. Inside the OS spinlocks is always used, because there is no-one to give up the CPU for and the OS has to continue running. More on this in lec13 20:28.
    - Simple lock using test-and-set: So a program will use this, and if the return is 1, then the lock has been set by someone else, and if the return is 0, then we know that we have locked the lock and we can continue.
    - Compare-and-swap: (int *ptr, int expected, int new) if the expected value matches the actual value, then set the value to the new. And then return the actual value.
- Semaphores: Very simple mutexes (binary semaphore).
  - A semaphore is a variable with an underlying counter. Two functions: up/post increments the counter, down/wait decrements the counter and blocks the calling thread if the result value is negative.
  - A semaphore with init value 1 acts as a simple lock
- monitors (CONDITION VARIABLES IN VIDEO)
  - A condition variable is a queue for threads that are waiting on some condition. A signel when then be send to a thread when it may continue. They can happen based on FIFO, at random, etc..

## Question 6: Concurrency problems

Writing multi-threaded programs is tricky and bugs are non-deterministic and occour based on execution order of threads - very hard to debug. The two types of bugs are roughly

-  deadlocks: threads cannot execute any further and wait for each other. (The program comes to a stop, and freezes)
- non-deadlocks: non deadlock but incorrect results when threads execute. (The program does not freeze, but they crash or the result is not what you expect) (like the one that would give different answers when incrementing with multiple treads)
  - Atomicity bugs: atomicity assumptions made by programmer are violated during execution of concurrent threads. Fix: locks for mutual exclusion.
  - Order-violation bugs: desired order of memory accesses is flipped during concurrent execution. Fix: condition variables.

#### Definition of deadlock

A state in which each member of a group is waiting for another member, including itself, to take action, such as sending a message or more commonly releasing a lock.

![](.\img\exam\3.png)

#### mutual exclusion

See question 5: race conditions and mutual exclusion.

#### resource allocation graph

#### Coffman’s conditions

Conditions for deadlock

- Mutual exclusion: a thread claims exclusive control of a resource (e.g., lock)
- Hold-and-wait: thread holds a resource and is waiting for another
- No preemption: thread cannot be made to give up its resource (e.g., cannot take back a lock)
- Circular wait: there exists a cycle in the resource dependency graph
- ALL four of the above contidions must hold for a deadlock to occour

#### solution strategies (prevention, avoidance, detection and recovery)

- Prevention
  - Mutual exclusion: acquire locks in a certain fixed order, e.g., both threads acquire L1 before L2. Total ordering (or even a partial ordering on related locks) must be followed.
  - Hold-and-wait: acquire all locks at once, say, by acquiring a master lock first. But this method may redure concurrent execution and performance gains.
- Avoidance
  - If the OS knew which process needs which locks, it can schedule the processes in that deadlock will not occur
    - Banker's algorithm, very popular but impractical in real life to assume this knowlegde.
- Detection and recovery
  - At least, detect and recover: reboot system or kill deadlocked processes.

#### how to achieve deadlock prevention (breaking Coffman’s conditions)

#### safe states and deadlock avoidance

#### deadlock detection and recovery

#### livelock

#### priority inversion

## Question 7: I/O, device drivers

I/O devices is keyword, mouse, network card and such. I/O devices connect to the CPU and memory via a bus which comes with different speeds. An I/O device connects via a bus to a port on the machine.

**Simple device model**

- Block devices: store a set of numbered blocks (like a disk)
- Character devices: produce/consume stream of bytes (keyboard or network card)

Devices expose an interface of memory registers

- Current status of device (busy, error, etc..)
- Command to execute
- Data to transfer

![](.\img\exam\8.PNG)

#### Types of I/O (programmed, interrupt-driven, DMA)

**Programmed**

![](.\img\exam\4.png)

![](.\img\exam\5.png)

![](.\img\exam\6.png)

![](.\img\exam\7.png)



#### implementation of I/O (as system calls)

How does OS read/write to registers like status and command?

- Explicit I/O instructions
  - E.g., on x86, in and out instructions can be used to read and write specific registers on a device
  - Privileged instructions accessed by OS (The user program will have to make a system call for the OS to do that job)
- Memory mapped I/O
  - Device makes registers appear like memory locations
  - OS simply reads and writes from memory
  - Memory hardware routes accesses to these special memory addresses to devices

#### definition and implementation of system call

See Types of I/O (programmed, interrupt-driven, DMA).

#### device drivers

Device drivers is part of OS code that talks to specific device, gives commands, handles interrupts etc. Each drivers knows its device, its registers and such - how to interact.

The OS knows how to read and write but the specifics for writing and reading for each device is handles by the drivers.

## Question 8: XV 6
Keywords: Your choice!

Idea: maybe take a few aspect that I know well and find out how these work in XV6!!

<https://www.youtube.com/watch?v=YPIw67LuuY4&feature=youtu.be&fbclid=IwAR2hAwLBGtaAWZt2F_6m0HBgvHaq-dr4jPoVgcOl8ggAlKcj6esK3Cz-D9s>