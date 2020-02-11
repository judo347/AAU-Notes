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

![](.\img\18.png)

![](.\img\19.png)

![](.\img\20.png)

![](.\img\21.png)

![](.\img\22.png)

![](.\img\23.png)

![](.\img\24.png)

Dublicates with null values or okay. As example: "Sue, null" and "Sue, null" is okay, they are not dublicates. Null values cant be compared.

![](.\img\25.png)

![](.\img\26.png)

Unary has one input, binary has two

![](.\img\27.png)

![](.\img\28.png)

![](.\img\29.png)

![](.\img\30.png)

![](.\img\31.png)

![](.\img\32.png)

![](.\img\33.png)

![](.\img\34.png)

![](.\img\35.png)

![](.\img\36.png)

![](.\img\37.png)

![](.\img\39.png)



Work from the inside and out. We rename both to differ them and then take the Cartesian product. Then we select ???

![](.\img\40.png)

![](.\img\41.png)

![](.\img\42.png)

![](.\img\43.png)

![](.\img\44.png)

Arity means number of attributes.

![](.\img\45.png)

![](.\img\46.png)

![](.\img\47.png)

![](.\img\48.png)

Join also removes dublicates.

![](.\img\49.png)

![](.\img\50.png)

![](.\img\51.png)

![](.\img\52.png)

![](.\img\53.png)



![](.\img\54.png)

![](.\img\55.png)

![](.\img\56.png)

false! They keep the first instance of dublicates, jo they are not communitive/the same. (Only in the context of relational algebra)

![](.\img\57.png)

![](.\img\58.png)

![](.\img\59.png)

![](.\img\60.png)

![](.\img\61.png)

![](.\img\62.png)



![](.\img\63.png)

![](.\img\64.png)

![](.\img\65.png)

count(*) = count star = count number of tubles in each group

![](.\img\66.png)

![](.\img\67.png)

![](.\img\68.png)

![](.\img\69.png)

![](.\img\70.png)

![](.\img\71.png)

![](.\img\72.png)

![](.\img\73.png)

![](.\img\74.png)


