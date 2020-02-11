# 01 - Introduction

Mondays: Lecture 10:15 - 12:00, Exercise 08:15 - 10:00. Ex is made for the previous lecture.

Slides is not based on lectures, but on topics.

Mind the notation in the exercises - to avoid losing points to the exam. Correct notation is a part of the goal.

Exam: Written: Pen, paper and that it! Duration: 2 hours. 100 total points, 50 points to pass. No time to think about how to solve - do lecture excersises and then you know how to solve them!

Self-study exercises can be handed in and has a deadline.

# 01 - Introduction to DBMS

Problems with data:

- Data format
  - Euro/USA date format
  - Same ids
  - Names with big or small first letter
- Blackouts (Power)
  - What was saved
  - Failed disk
  - Which version is correct?

![](.\img\5.png)

![](.\img\6.png)



![](.\img\7.png)

Line under al_ID, means it is unique and can be used to identify a row. ar_ID -> artists, mens that data is this coloum is an ID for another table.

![](.\img\8.png)

Never make nested relations in exam or hand-in. This is shown in the album coloumn.

![](.\img\9.png)

How the data is actualy stored. This should be completed hidden from the aplication.

![](.\img\10.png)

![](.\img\11.png)

![](.\img\12.png)

In external schemas we can define if an app. only gets access to a specific set of data.

![](.\img\13.png)

Database software:

- Big players: Oracle, Microsoft SQL Server, IMB DB2
- Small players: **PostgreSQL**, MySQL

![](.\img\14.png)

![](.\img\15.png)

![](.\img\16.png)

![](.\img\17.png)

# 02 - Relational model and relational algebra

![](.\img\3.png)

![](.\img\4.png)

instance is a snapshot of the relation, containing values for a specific point in time.

Slide 5-10

Dublicates with null values or okay. As example: "Sue, null" and "Sue, null" is okay, they are not dublicates. Null values cant be compared.

Slide 11

Slide 12: Unary has one input, binary has two

Slide 13-18

Slide 19: Work from the inside and out. We rename both to differ them and then take the Cartesian product. Then we select ???

Slide 20-22

Slide 23: Arity means number of attributes.

Slide 24

Slide 26

Slide 27: Join also removed dublicates.

Slide 28-29

Slide 30: false! They keep the first instance of dublicates, jo they are not communitive/the same. (Only in the context of relational algebra)

Slide 32--37

Slide 39

SLide 40: count(*) = count star = count number of tubles in each group

Slide 41

Slide 43-50







