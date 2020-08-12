1. The relational model and relational algebra
2. ER modelling
3. Mapping of ER diagrams to relations
4. Functional dependencies and normal forms
5. SQL
6. Concurrency control
7. Recovery
8. Query optimization
9. Physical design, including indexes





## The relational model and relational algebra

Slides: DBS-2

## ER modelling

Slides: DBS-3

## Mapping of ER diagrams to relations

## Functional dependencies and normal forms
## SQL

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

## Concurrency control
## Recovery
## Query optimization

Slides: DBS-8

## Physical design, including indexes

Slides: DBS-7