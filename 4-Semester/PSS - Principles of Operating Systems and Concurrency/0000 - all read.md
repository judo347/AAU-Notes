Chapter 1:

Chapter 2:

Three main topics: virtualization, concurrency, and persistence.

how it decides what program to run next on a CPU, how it handles memory overload in a virtual memory system, how virtual machine monitors work, how to manage information on disks, and even a little about how to build a distributed system that works when parts have failed. (OS)

the processor **fetches** an instruction from memory, **decodes** it (i.e., figures out which instruction this is), and **executes** it (i.e., it does the thing that it is supposed to do, like add two numbers together, access memory, check a condition, jump to a function, and so forth). After the instruction is done, the processer moves to the next one. the **Von Neumann** model.

primary goal of making the system easy to use.

There is a body of software, in fact, that is responsible for making it easy to run programs (even allowing you to seemingly run many at the same time), allowing programs to share memory, enabling programs to interact with devices, and other fun stuff like that. That body of software is called the operating system (OS).

The primary way the OS does this is through a general technique that we call **virtualization**. That is, the OS takes a physical resource (such as the processor, or memory, or a disk) and transforms it into a more general, powerful, and easy-to-use virtual form of itself. Thus, we sometimes refer to the operating system as a virtual machine.

 OS provides a standard library to applications (Machine calls for the programs to use, these machine calls is the connection between the programs and hardware)

OS is sometimes known as a resource manager.

#### 2.1 Virtualizing The CPU

**virtualizing the CPU**, makes a large number of virtual cpu's in order to run a large number of programs, thus creating the illusion of having many cpu's. if two programs want to run at a particular time, which should run? This question is answered by a policy of the OS; policies are used in many different places within an OS to answer these types of questions, and thus we will study them as we learn about the basic mechanisms that operating systems implement (such as the ability to run multiple programs at once). Hence the role of the OS as a resource manager.

#### 2.2 Virtualizing Memory

Memory is just an array of
bytes; to read memory, one must specify an address to be able to access the data stored there; to write (or update) memory, one must also specify the data to be written to the given address.

Multiple simultaneously running programs that get the same memory address appointed. This is because they have virtual memory, so the given addresses does not correlate to the same real address.

#### 2.3 Concurrency

three instructions: one to load the value of the counter from memory into a register, one to increment it, and one to store it back into memory. Because these three instructions do not execute atomically (all at
once), strange things can happen. It is this problem of concurrency. So before one value is saved the other process saves its values and then the first process saves theirs and so overwrites the current value with the same number.

#### 2.4 Persistence

RAM = volatile memory.

CPU and RAM are vitulized and shared, but the HDD and SSD or not!

most file systems first delay writes for a while, hoping to batch them into larger groups.

To handle the problems of system crashes during writes, most file systems incorporate some kind of intricate write protocol, such as journaling or copy-on-write, carefully ordering writes to disk to ensure that if a failure occurs during the write sequence, the system can recover to reasonable state afterwards.

#### 2.5 Designing Goals

One of the most basic **goals** is to build up some abstractions in order to make the system convenient and easy to use.

One **goal** in designing and implementing an operating system is to provide high **performance**; another way to say this is our goal is to **minimize the overheads** of the OS.

These overheads arise in a number of forms: extra time (more instructions) and extra space (in memory or on disk).

Another **goal** will be to provide protection between applications, as well as between the OS and applications.

Protection is at 
the heart of one of the main principles underlying an operating system, which is that of **isolation**; isolating processes from one another is the key to protection and thus underlies much of what an OS must do.

operating systems often strive to provide a high degree of **reliability**. If the OS crashes, so does all other programs.

Other goals make sense: **energy-efficiency** is important in our increasingly green world; **security** (an extension of protection, really) against malicious applications is critical, especially in these highly-networked times; **mobility** is increasingly important as OSes are run on smaller and smaller devices.

#### 2.6 History

When a system call is initiated (usually through a special hardware instruction called a **trap**), the hardware transfers control to a pre-specified **trap handler** (that the OS set up previously) and simultaneously raises the privilege level to **kernel mode**. When the OS is done servicing the request, it passes control back to the user via a special **return-from-trap** instruction, which reverts to user mode while simultaneously passing control back to where the application left off.

### 4 The abstraction: The Process

The OS creates this illusion by virtualizing the CPU. By running one process, then stopping it and running another, and so forth, the OS can promote the illusion that many virtual CPUs exist when in fact there is only one physical CPU (or a few). This basic technique, known as time sharing of the CPU, allows users to run as many concurrent processes as they would like; the potential cost is performance, as each will run more slowly if the CPU(s) must be shared.

**Time sharing** is a basic technique used by an OS to share a resource. By allowing the resource to be used for a little while by one entity, and then a little while by another, and so forth, the resource in question (e.g., the CPU, or a network link) can be shared by many. The counterpart of time sharing is space sharing, where a resource is divided (in space) among those who wish to use it. For example, disk space is naturally a **space shared** resource; once a block is assigned to a file, it is normally not assigned to another file until the user deletes the original file.

### 6 Direct Execution

DONE

### 7 CPU Scheduling

Approaches:

- FIFO: First in, first out / FCFS: Fist come, First Served.

- SJF: Shortest Job Frist
- STCF: Shortest Time-to-Completion First / PSJF: Preemptive Shortest Job First
- Round Robin (Good for response time)
- MLFQ: Multi-level Feedback Queue (Chapter 8)

You should note that turnaround time is a performance metric, which will be our primary focus this chapter. Another metric of interest is fairness, as measured (for example) by Jain’s Fairness Index [J91]. Performance and fairness are often at odds in scheduling; a scheduler, for example, may optimize performance but at the cost of preventing a few jobs from running, thus decreasing fairness. 

![](.\img\2.png)

### 8 Multi-level Feedback

The Solaris MLFQ implementation — the Time-Sharing scheduling class, or TS — is particularly easy to configure; it provides a set of tables that determine exactly how the priority of a process is altered throughout its lifetime, how long each time slice is, and how often to boost the priority of a job [AD00]; an administrator can muck with this table in order to make the scheduler behave in different ways. Default values for the table are 60 queues, with slowly increasing time-slice lengths from 20 milliseconds (highest priority) to a few hundred milliseconds (lowest), and priorities boosted around every 1 second or so.

### 9 Lottery Scheduling

Has not read.

### 13 Address Spaces

