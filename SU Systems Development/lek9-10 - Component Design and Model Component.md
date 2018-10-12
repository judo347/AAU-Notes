# Component Design and Model Component

## Components design

#### Results

![](.\img\51.png)

#### Key Concepts: From Architecture to Components

![](.\img\51.png)

#### Model Component: Results

![](.\img\53.png)

#### Example: bank

![](.\img\54.png)

##### Represent Private Events

- Sequence and selection
  - Represent these events as a state attribute in the class described by the statechart diagram.
  - Every time one of the involved events occurs, the system shall assign a new value to the state attribute.
  - Integrate the attributes of the involved events into the class.
- Iteration
  - Represent these events as a new class; attach it to the class described by the statechart diagram using an aggregation structure.
  - For each iteration that occurs, the system shall generate a new object from the class.
  - Integrate the event attributes into the new class.

Text to: Model Component: Results: picture

- The event ‘change address’ is private to the class Customer. It is an iteration in the statechart diagram of the class.
- Represent this event as a new class
- The event ‘credit approval’ is private to the class Customer. It is part of a sequence in the statechart diagram

- Represent this event as an attribute

#### Represent Common Events

Common events:

- If the event is involved in the statechart diagrams in different ways, represent it in relation to the class that offers the simplest representation.

- If the event is involved in the statechart diagrams in the same way, you must weigh possible representations against each other

#### Represent Common Events: Solution A

![](.\img\55.png)

#### Represent Common Events: Solution B

![](.\img\56.png)

#### Restructure Classes 

- The revised class diagram represents the same information as the statechart diagrams

- The class diagram can often be simplified without loss of information:
  - Generalization
  - Association
  - Embedded iterations

**Take case of unnecessary association!**