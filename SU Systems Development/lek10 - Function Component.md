# Function Component

From architecture to components:
![](.\img\57.png)

#### Model Component: Results

![](.\img\58.png)



Bank example: Remove private event: Credit approval: only happen once and only to customer.

SLIDES 9 - 13!!!!!!!!!!!!!!!!!

INSÆT NEDENSTÅENDE EKSEMPEL!! BOTH CLASS DIAGRAMS + EVENT TABLE (enhanced solution)

Event table for representing the class diagram RULES: (Exam opg example 4.2 Jan 2018)

- if an event has only one * and nothing else, it is a private event, and it need a class for it self.

- If an event has only one + and nothing else, it has to represented as an attribute in the class where it is listed.

- If an event has one + and more *, we can note that as an attribute in the class with the +.
- If an event has two or more * and no + then make a new class for that event, and create association for the classes with *.

SLIDE 16-17!!!!!!!

SLIDE 19-20!!!

### Patterns

#### Patterns: Model-Class Placement

This one should be used when possible, it is the best.

![](.\img\59.png)

#### Patterns: Function-Class Placement

![](.\img\60.png)

#### Pattern: Strategy

![](.\img\61.png)

#### Pattern: Active Function

![](.\img\62.png)

A passive signal is when you for example update your model and then call a signal function.



