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

### Components

![](.\img\81.png)

## Usage

### Work Tasks:

- Register tournament/configure tournament stages: The host decides to register and set-up a tournament, in accordance to the wanted tournament-structure.
- Register bot: The host decides to register a bot for the tournament. The host must enter the bots name, its path to its config, its elo, and optionally a description. Values can be entered in any order, and when done, the task i complete. The task can also be aborted instead of entering a value.
- Edit a played match: The streamer decides to go back a edit the results of a played match. The streamer will select a match to edit, and enter the desired results. The streamer ends the task at any time, either saving the values or abouting without save. 
- Start match: The streamer decides to start the next match. First they selects the match they want to start, then starts it. This runs the RLBot framework with the bots in the selected match and creates an overlay with the bots’ name.
- Conclude match: The host should be able to end a specific match and fetch the results if wished. First they select a match they want to conclude, then the system will ask if the fetched result should be assigned to this match, if no is chosen the host should be prompted to enter a result manually.

