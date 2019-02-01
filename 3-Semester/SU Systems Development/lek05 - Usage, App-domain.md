# III: 6: Usage: Actors, Functions, Work Tasks, Use Case, Patterns (Procedual, Material). 

Event tables: * = 0 or more, + = 0 or 1 time.

Application Domain Analysis: Results

- Actors (users and other systems) and Use case

![](.\img\26.png)

The use case: Cash Withdrawal: should mention the cancel option displayed below.

- Functions

  ![](.\img\24.png)

- User interface (Used/learned in DEB)

![](.\img\25.png)

#### Stable versus Transient Properties

Stable properties                                            Transient properties 

$\leftarrow ------------------------ \rightarrow$

Model                                 Functions                                 Interfaces

- Compare the model, functions, and interfaces between a classical bank and a modern internet-based bank.

The model is pretty much the same: users, banker and such is the same. Functions is the same and more has properly been added. Interfaces has changed the most; much smaller and more options. It is totally different.

#### Start from Work Tasks

![](.\img\27.png)

#### Actor

- Identify actors
  - Determine the distribution of roles of the works tasks related to the system.
  - Consider human actors.
  - Consider other systems as actors
- Describe actors
  - Make actor specifications

See top of chapter for example.

#### Use case

- Identify use cases where the system is used to carry out part of a work task.
- Describe use cases
  - As text.
  - As a statechart diagram.

See top of chapter for example.

#### Evaluate Systematically

- Systematic review
  - Use cases should be simple and constitute a coherent whole
  - The description of actors and use case should provide understanding and overview
  - Use cases should be described in enough detail to enable identification of functions and interface elements.
- Experiment with prototypes
  - A use case is best evaluated trough planned prototype experiments.

![](.\img\28.png)



#### Explore Pattern: Procedural

![](.\img\30.png)

#### Explore Pattern: Material

![](.\img\29.png)

#### Appreciate the Difference: Actors and Classes

|             | Application Domain | Problem Domain        |
| ----------- | ------------------ | --------------------- |
| **Static**  | Actors             | Classes and Structure |
| **Dynamic** | Use Cases          | Behavioural Patterns  |

