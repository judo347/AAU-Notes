## 5: Behaviour: Statechart Diagrams, Explore Patterns (Stepwise relation and role).

#### Result

![](.\img\12.png)

#### Behaviour: Activities

![](.\img\13.png)

#### Event Traces

- A sequence of events involving a specific object



- Account-1: opened-closed
- Account-2: opened-deposited-withdrawn-deposited-deposited-deposited-...
- Account-3: opened-deposited-withdrawn-withdrawn-...
- Account-n:...

#### Describe Behaviour Patterns

- Make event traces for each class.
- For each class ask:
  - Which event(s) cause the creation of a problem-domain object? These events are good as selections that can cause the birth of an object.
  - Which event(s) cause the disappearence of a problem-domain object? These events are grouped as selections that can cause the death of an object
- Typical event traces:
  - Which events occur together in a sequence?
  - Are there any alternative events?
  - Can a given event occur more than once?
  - Is the overall form structured or unstructured?

#### Control Structures

![](.\img\14.png)

#### Conditions in Statechart Diagrams

![](.\img\16.png)

#### Common Events: State Chart Diagram

Because 1 customer can have multiple accounts.

![](.\img\17.png)



#### Consider Structures

- Aggregation and association
  - if two or more object have common events, consider adding an aggregation or association structure between them.
  - If two classes are related by an aggregation or association structure, at least one common event should be considered.
- Generalization
  - If the same event is tied to two classes, consider whether one class is a generalization of the other.

#### Hierarchical states

![](.\img\18.png)

#### Example: Streaming service

![](.\img\19.png)

#### Explore Patterns: Stepwise Relation

![](.\img\20.png)

Events that happen in steps. Student is registered to a semester, then a class, then a group.

#### Explore Patterns: Stepwise Role

![](.\img\21.png)

#### Explorer Patterns: Composite

![](.\img\22.png)





