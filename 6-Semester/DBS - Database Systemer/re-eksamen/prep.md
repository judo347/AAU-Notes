1. The relational model and relational algebra
2. ER modelling
3. Mapping of ER diagrams to relations
4. Functional dependencies and normal forms
5. SQL, **ok done 13/8**
6. Concurrency control
7. Recovery
8. Query optimization
9. Physical design, including indexes, **done 17/8**



Torsdags todos:

- Paint as whiteboard on MSTeams
- No are allowed, but should not be used :S
  - Make compact notes or alike to each topic, do this Thursday.





## 1. The relational model and relational algebra

Slides: DBS-2

**CHECK OWN NOTES!**

## 2. ER modelling

Slides: DBS-3 

**CHECK OWN NOTES!**

## 3. Mapping of ER diagrams to relations

**CHECK OWN NOTES!**

## 4. Functional dependencies and normal forms

**CHECK OWN NOTES!**

## 5. SQL

Slides: DBS-5, own notes

**What is SQL**: ?????? TODO

a *declarative* query language ("What" not "how"). Used to 

Introduction: (Explain terms)

- Tables can contain duplicates
- Tables can have an order
- Tables must not necessarily have a key

SQL sublanguages: https://www.geeksforgeeks.org/sql-ddl-dml-tcl-dcl/

- DDL: Data Definition Language: basic definition of data: create, change and deletion of tables.
- DML: Data Manipulation Language: TODO: INSERT INTO
- DCL: Data Control Language: Rights management: used to CONTROL the ACCESS to a db: Create, Drop, Rename
- TCL: Transaction Control Language: MANAGE TRANSACTIONS in db: Rollback, Commit, Savepoint
- DQL: Data Query Language: PERFORMS QUERIES on DATA within SCHEMA OBJECTS: Grant, Revoke (Advanced SQL)


#### TCL: Transaction Control Language

![](.\img\2.png)

#### DQL: Data Query Language

![](.\img\1.png)

### Basic SQL operations

#### SFW Block (Basic building block)

![](..\img\222.png)

Example: (TODO, bug tid på eksemplet! Uddyb)

```sql
SELECT name, year, producer.vineyard
FROM wine, producer
WHERE wine.vineyard = producer.vineyard
```

#### Nested Queries

```sql
SELECT name
FROM professor
WHERE empid IN (SELECT taughtby FROM course);
```

![](.\img\0.png)

## 6. Concurrency control
## 7. Recovery
## 8. Query optimization

Slides: DBS-8

![](.\img\40.png)

![](.\img\41.png)

**Query Costs**

![](.\img\42.png)

**Query Optimization**

![](.\img\43.png)

#### Heuristic (logical) query optimization

TODO!!!!!!!

#### Operator implementations TODO IS THIS NEEEDED?!?!?!?!

TODO!!!!!!!

#### Cost-based (physical) query optimization

TODO!!!!!!!

## 9. Physical design, including indexes

Slides: DBS-7

### File Organization (Physical design)

![](.\img\3.png)

![](.\img\4.png)

![](.\img\5.png)

![](.\img\6.png)

![](.\img\7.png)

TODO Emphasize above term! Learn them!

![](.\img\8.png)

#### Fixed vs Variable size records

![](.\img\13.png)

![](.\img\14.png)

#### Organizing records in a file

**Determine the order of records within a file**

- Heap file organization: A record can be placed **anywhere** in the file
- Sequential file organization: Records stored in **sequential order** **by the value of the search key**
- Hash file organization: Hash the record to a **block based** on a **hash function** and a hash key

![](.\img\15.png)

![](.\img\16.png)

![](.\img\17.png)

![](.\img\18.png)

TODO make the 3 above slides to easy notes!



### Indexes

**Assumptions**

![](.\img\19.png)



#### Ordered indexes

![](.\img\20.png)

![](.\img\21.png)

![](.\img\22.png)

![](.\img\23.png)

![](.\img\24.png)

![](.\img\25.png)

![](.\img\26.png)



#### B$^+$-tree indexes

![](.\img\27.png)

**Node Structure**

![](.\img\28.png)

![](.\img\29.png)

![](.\img\30.png)

![](.\img\31.png)

**A minimal B$^+$-tree example**

![](.\img\32.png)

![](.\img\33.png)

**B$^+$-tree updates**

![](.\img\34.png)

TODO slide 30-36 for update examples



#### Unordered indexes (hashing)

**Static hash index**

![](.\img\35.png)

![](.\img\36.png)

![](.\img\37.png)

![](.\img\38.png)

![](.\img\39.png)



### Physical Design Tuning

![](.\img\9.png)

![](.\img\10.png)

TODO??!? Explain above slide?!

![](.\img\11.png)

![](.\img\12.png)



