# 00 - Mics

Exam is oral.

# 01 - Introduction

#### Computer networks

- Client-server
- Home Applications: peer-to-peer (Talks without a server)
- Mobile Users: wifi, 3G, 4G, etc.

Categories:

- PAN: bluetooth, etc..
- LAN:
- MAN: Metropolitican Area Network, a city or if a datacenter has replicateded structure it would be called two MAN. 
- WAN: Country
- Internet: interplanetary

Internet = inter-network: ~58.000 different networks on the internet.

#### Network Software

- Protocol layering to device network functionality. Adds a header with control information.
- Protocol layers solves different problems.
- Service provided by a layer is devided into two categories:
  - Connection-oriented: setup and torn down: e.g. phone call.
  - Connectionless: messages are handled separately, e.g., postal delivery.

![](.\img\01.PNG)

Reference models:

- OSI-model

![](.\img\02.jpg)

- TCP/IP (not really a model)

![](.\img\03.GIF)

- Model from the book

![](.\img\04.jpg)

#### Example Networks

- The Internet (Complexed, many different things is connected (Sattelite link, ISP, IXP, intranet...))
- 3G Mobile phone network
- Wireless
- RFID

### Distributed systems

- Cloud computing
- Distributed computing (PC Cluster, Super computing)
- Games running through clients only (peer-to-peer)
- Automotive control 
- Sensor-networks
- Mission-critical applications (Where multiple devices work together)
  - Example: rail control systems, military command, power plants... etc.

#### Definition

Distributed system: when they do not operate under the **same clock** (So a multicore pc is not a distributed system.)

A **distributed system** is the one in which hardware and software components at **networked computers** communicate and coordinate their activity only by **passing messages**.

#### Consequences

![](.\img\2.png)

#### Why a Distributed System?

![](.\img\3.png)

Better performance

- Increased processing pwoer
- Load balancing

Increased Reliability

- Exploit independent failures property
- Redundancy

## Models

#### Service layers

![](.\img\4.png)

#### Middleware

![](.\img\5.png)

#### Client / Server model

![](.\img\6.png)

#### A distributed application based on peer processes

![](.\img\7.png)

#### Client Server vs Peer based

Client-Server: Most widely used model. Functional specialization. Asymmetrical. Tends to be Centralized. Tends to scale poorly

Peer: Symmetrical, computers runs same algorithms / same responsibilities.

Truly Distributed: Share / exploit resources at a large number of participants.

#### Interaction model

![](.\img\8.png)

#### Failure Models

![](.\img\9.png)

#### Timing failures

![](.\img\10.png)

#### Security model

![](.\img\11.png)



