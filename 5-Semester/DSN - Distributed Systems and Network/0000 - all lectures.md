# 00 - Mics

Exam is oral. Opgaveregnings hjælp fås ved at sende sms til 31621403.

Læsning til forelæsning sker efter, så læs kun det nædvendige.

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

# 02 - The medium access control layer and the network layer

#### Medium Access Control Sublayer

- Channel Allocation Problem
- Multiple Acccess Protocols
- Ethernet
- Wireless LAN's

#### The MAC Sublayer

![](.\img\12.png)

Dette lag fungerer godt når kun få sender og modtagerne holder mund. Hvis nogen hører nogen sige noget holder man mund.

![](.\img\13.png)

![](.\img\14.png)

#### Multiple Access Protocols

![](.\img\15.png)

![](.\img\16.png)

![](.\img\17.png)

![](.\img\18.png)

CSMA, er den protocol der ligger til grunds for stort set alt netværks kommunikation. 0.5-persistent betyder at når vi kan sende, er der 50% chance for at vi gør det.

![](.\img\19.png)

Bruges stort set over alt med variation. Fungerer rigtig fint, så længe vi er på et kabel. Pakke størrelse kommer an på kabel længde - lysets hastighed.

![](.\img\20.png)

Signaler taber effekt over afstande. 

![](.\img\21.png)



Missing a b: ".. when sending to " **B**

![](.\img\22.png)

Kollitioner er dyrer i trådløse netværk. RTS = request to send, CTS = clear to send. Denne bliver brugt til mobil netværk og wifi, dog med moditikationer. Bluetooth er dog mere indviklet, men er baseret på noget lignende. Kollitioner er grimme. Kabler er meget nemmere da vi ved hvor mange der er på nettet i modsætning til wifi (altså hvor mange der sender og modtager).

![](.\img\23.png)

![](.\img\24.png)

Har også opgaven at vedligeholde topologisk information.

![](.\img\25.png)

![](.\img\26.png)

![](.\img\27.png)

(**exam pensum**) Fejl i tabel, router kan kun sende videre til dem den er forbundet til. 

![](.\img\28.png)

Routeren vælger hvor den skal sende pakken hen baseret på deres tag og ikke dens destination. Dette er ligesom det gamle telefon netværk. I sær tilfælde kan man lave dette på tværs af ISP'er, men dette er ikke normalt, og man gør det kun med folk man kender. (benyttes i CERN).

![](.\img\29.png)

(**exam pensum**)

![](.\img\30.png)

Når routeren kun kan se sine naboer er det svært at træffe beslutninger om hvor den skal sende pakker hen. Hvordan går routeren topologisk forståelse.

![](.\img\31.png)

![](.\img\32.png)

![](.\img\33.png)

![](.\img\34.png)

Flooding var backup algorithme på de første netværk.

![](.\img\35.png)

![](.\img\36.png)

![](.\img\37.png)

Denne algorithme bruges selvfølgelig ikke. Kan dog godt fikses, men den algorithme har Cisco taget patent på.

![](.\img\38.png)

Dette er den algorithme man bruger på internettet. Sending alt vi ved om vores topologi i en link-state-packet.

![](.\img\39.png)

Disse pakker bliver videresendt rundt i nettet, så det ikke kun er naboerne der går dem, men alle, aka flooding. Men det er derfor vi har *seq* nummer der er løbenummer, og *age* der gør at pakken ikke bliver sendt videre efter et stykke tid. (dør) 

Internettet er bygget op som et træ/hiraki struktur så hele nettet ikke bliver flooded af LSP. Ligesom når man kører, kører man på motervejen selvom der måske er en kortere vej. Dette ses på næste slide.

![](.\img\40.png)



Beskrevet ovenstående. Denne routing kører en anden protocol (BGP), men den skal vi ikke vide noget om. Pga. penge.

![](.\img\41.png)

![](.\img\42.png)

![](.\img\43.png)

![](.\img\44.png)

![](.\img\45.png)

![](.\img\46.png)

![](.\img\47.png)



Faktisk en ok måde at gøre det på hvad angår bandwith, da vi anyways skal kommunikere og så mange pakker er det heller ikke vi sender. Det der er skidt er hvis stien ændre sig.

![](.\img\48.png)

![](.\img\49.png)

![](.\img\50.png)

![](.\img\51.png)

![](.\img\52.png)

![](.\img\53.png)

Subnetting is done to avoid checking all bits (and other reasons).

![](.\img\54.png)

![](.\img\55.png)(exam penum) 

![](.\img\56.png)

![](.\img\57.png)

Ports are used to save IP-addresses.

![](.\img\58.png)

![](.\img\59.png)

![](.\img\60.png)

![](.\img\61.png)