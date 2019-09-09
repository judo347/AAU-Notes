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

Slides: 2+3

3: dette lag fungerer godt når kun få sender og modtagerne holder mund. Hvis nogen hører nogen sige noget holder man mund.

Slide 4: Channel Allocation Problem (I)

Slide 5, 6 (multiple access protocol), 7- 9(CSMA(I)), 10: CSMA, er den protocol der ligger til grunds for stort set alt netværks kommunikation. 0.5-persistent betyder at når vi kan sende, er der 50% chance for at vi gør det.

Slide 11: CSMA (3) -Collision Detection: Bruges stort set over alt med variation. Fungerer rigtig fint, så længe vi er på et kabel. Pakke størrelse kommer an på kabel længde - lysets hastighed.

SLide 12: signaler taber effekt over afstande. 

Slide 13 (Wireless LAns (2)): "when sending to " **B**

Slide 14, 15: kollitioner er dyrer i trådløse netværk. RTS = request to send, CTS = clear to send. Denne bliver brugt til mobil netværk og wifi, dog med moditikationer. Bluetooth er dog mere indviklet, men er baseret på noget lignende. Kollitioner er grimme. Kabler er meget nemmere da vi ved hvor mange der er på nettet i modsætning til wifi (altså hvor mange der sender og modtager).

Slide 16, 17: har også opgaven at vedligeholde topologisk information.

(exam pensum) Slide 18,  19, 20: fejl i tabel, router kan kun sende videre til dem den er forbundet til. Slide 21: routeren vælger hvor den skal sende pakken hen baseret på deres tag og ikke dens destination. Dette er ligesom det gamle telefon netværk. I sær tilfælde kan man lave dette på tværs af ISP'er, men dette er ikke normalt, og man gør det kun med folk man kender. (benyttes i CERN).

(exam)Slide 22. 

Slide 23: når routeren kun kan se sine naboer er det svært at træffe beslutninger om hvor den skal sende pakker hen. Hvordan går routeren topologisk forståelse.

Slide 24, 25, 26, 27: den var backup algorithme på de første netværk.

Slide 28-30: denne algorithme bruges selvfølgelig ikke. Kan dog godt fikses, men den algorithme har Cisco taget patent på.

Slide 31: Dette er den algorithme man bruger på internettet. Sending alt vi ved om vores topologi i en link-state-packet.

Slide 32: Disse pakker bliver videresendt rundt i nettet, så det ikke kun er naboerne der går dem, men alle, aka flooding. Men det er derfor vi har *seq* nummer der er løbenummer, og *age* der gør at pakken ikke bliver sendt videre efter et stykke tid. (dør) 

Internettet er bygget op som et træ/hiraki struktur så hele nettet ikke bliver flooded af LSP. Ligesom når man kører, kører man på motervejen selvom der måske er en kortere vej. Dette ses på næste slide.

Slide 33: beskrevet ovenstående. Denne routing kører en anden protocol (BGP), men den skal vi ikke vide noget om. Pga. penge.

Slide 34 - 37, 39-41: faktisk en ok måde at gøre det på hvad angår bandwith, da vi anyways skal kommunikere og så mange pakker er det heller ikke vi sender. Det der er skidt er hvis stien ændre sig.

Slide 42-47: subnetting is done to avoid checking all bits (and other reasons).

Slide 48.
(exam) Slide 49.

Slide 51: ports are used to save IP-addresses.

Slide 52-55