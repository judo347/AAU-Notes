## System Choice

### FACTOR

A FACTOR criterion consists of six elements; functionality, application domain, conditions, technology, objects, and responsibility:

- **Functionality**: The system is able to create and manage tournaments for the RLBot-community. It can automatically start matches. Teams, match results, and stages can be edited at any given time. The system is able to save and load tournaments.
- **Application Domain**: The system is used by members of the RLBot-community to run tournaments that are live-streamed.
- **Conditions**: The system can be used during a live-streamed tournament and while Rocket League is running. The system is used by experienced and novice hosts of RLBot tournaments.
- **Technology**: The system is written in Java and runs on a Windows computer, which is able to run an instance of Rocket League. Furthermore, the machine has sufficient resource-overhead for live-streaming purposes.
- **Objects**: The most important objects in the problem domain are bot, team, match, and stage.
- **Responsibility**: The system is responsible for generating and scheduling matches. The user is responsible for inputting the correct match results and restore the tournament state after a critical edit.

## Problem Domain Analysis

### Classes

This problem domain contains the following classes: **Tournament**, **Stage**, **Format**, **Match**, **Team**, and **Bot**. Following is the description of each class and its behaviour.

#### Bot and team

![](.\img\72.png)

#### Match

![](.\img\73.png)

#### Stage and Format

![](.\img\74.png)

#### Tournament

![](.\img\75.png)

### Events

All of the classes presented have behaviour, these behaviours are described with events which can be shown with an event-table. An event is more specifically an atomic, singular event that can occur in the problem-domain. The events are written in past-tense.

![](.\img\76.png)

The table shows a multitude of events that happen in the problem-domain, along with their relation to the classes that are noted with either a "*", for multiple occurrences, or "+", for a single occurrence.

### Structure

![](.\img\77.png)

## Application-domain Analysis

### Rich Picture

![](.\img\78.png)

## Design

### Design criteria

![](.\img\79.png)

# TEMP

### Functions

![](.\img\80.png)



