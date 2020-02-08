# Mini-Project Part 1 - Preliminary Database Modelling

**Notes:**

- Store information about: actors, directors, writers, movies, awards, ratings and user ratings.
- 5 attributes
- Tasks
  - Describe the database
  - List the tables with attributes

### MiMDB introduction

The database will store data used in the movie database system called Mikkels Movie Database - MiMDB for short.

### Table description

The database has five tables which has the following attributes:

- Movie table: movie ID (mv_ID), title, release year, actors (ac_ID -> actors), user rating, awards, ratings (rt_ID -> ratings)
- Actors table: actor ID (ac_ID), name, birth year
- Director table: director ID (dr_ID), name, birth year
- Writer table: writer ID (wr_ID), name, birth year
- Rating table: rating ID (rt_ID), name

### Current problems/questions

- What if a person is both an actor and director? Duplicate data okay?
- User rating: the idea is to store it as a single value, [0-5], and then update it each time a new rating is provided by a user. Is this bad practice? Or is it okay, giving that the DBMS calculates and updates the value?