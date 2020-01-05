# Random notes

<span style="color:red">Husk det tager tid at printe og øve!!!!!!!</span>

Løb over alle spørgsmål "hurtigt" og hvis der er tid til sidst, så gå i dybten med dem!

Workload:
- 5/1: 8 / 3dage = 2.667 questions per day
- 6/1 (udregnet 5/1 hvor 1 blev laver): 7/2 = 3.5

**Status**:

- 1: Stort set done.
- 2: Stort set done.
- 3: Stort set done.
- 4:
- 5:
- 6:
- 7:
- 8:
- 9:
- 10:

# Question 1: Networking and Internetworking
Question: **Explain what a network is and how we can connect different networks together to form an internetwork [CN1].**
**Explain what a network is, the idea of protocol hierarchies and the benefits. What are the OSI and IP models and what responsibility resides at each layer? What is the difference between a connection oriented and a connectionless network? Give examples of different kinds of networks in use.**

### What is a network and examples of different types of networks

Slide 7-8

A network may contain devises like computers, printers, routers, switches and other devices connected to the network. These devices form different connections like, client-server, peer-to-peer (talks without server) and mobile users like wifi, 3G, etc..

Types:

- PAN: bluetooth, etc..
- LAN: may also include wifi, and can be called WLAN.
- MAN: Metropolitican Area Network, a city or if a datacenter has replicateded structure it would be called two MAN. 
- WAN: Connect devices over a country, ISP network, VPN
- Internet: interplanetary

Internet = inter-network: ~58.000 different networks on the internet.

![](.\img\exam\slides\7.PNG)

![](.\img\exam\slides\8.PNG)

### Idea: protocol hierarchies and the benefits

Slide 4. <span style="color:blue">Other information for also 3? Not really?</span>

![](.\img\exam\slides\4.PNG)

The above slide shows that at each layers, additional information is added to the packet. 

![](.\img\exam\1.PNG)

### OSI and IP model - responsibility resides at each layer?

Slide 5-6

<span style="color:red">Text to explain models</span>

![](.\img\exam\slides\5.PNG)

![](.\img\exam\slides\6.PNG)

### Connection oriented vs connectionless network

Service provided by a layer is devided into two categories:

- Connection-oriented: setup and torn down: e.g. phone call.
- Connectionless: messages are handled separately, e.g., postal delivery.

![](.\img\01.PNG)

TCP is Connection-oriented and UDP is connnectionless.

# Question 2: Routing

Question: **Explain how packages are routed in an internetwork [CN5].**
**What is the purpose of routing packages. How does a routing table look for a connectionless network? For a connection oriented network? How do we construct and maintain a routing table in a connectionless network - explain either distance vector or link state routing. How do we represent routing tables, consider especially how to represent them in a compact form.**

<span style="color:red">Give short introduction to what a network is it focus on the router part of it. Use slide 8 </span>
![](.\img\exam\slides\8.PNG)

### Purpose of routing packages in an internetwork
To send information between devices on different networks, involving a number of routers. 

### Routing table look for connectionless network?
Slide 13
![](.\img\exam\slides\13.PNG)
Slide 13: Hver router har deres tabel, første kollonne lonne er hvad slut destinationen for pakken er, og anden kollonne er hvor den skal sendes videre til for at komme imod destinationen. <span style="color:blue">Det er vel ip-addresser i virkerlighenden. </span>
Fejl i A's tabel (later): den kan du sende til dem den er fundet til. 

### Routing table look for connection oriented network?
Slide 14
![](.\img\exam\slides\14.PNG)
Pakker får et tag, og alle router tabeller er så sat op så de ved hvilke tag skal sendes hvor hen. Dvs. at når alt er sat op, bliver pakker med samme tag altid sendt samme sted hen.
<span style="color:blue">Hvad betyder tabellerne? </span>

### How to contruct and maintain routing tables in connectionless network?
Slide 15
![](.\img\exam\slides\15.PNG)
Finding the optimal route matters. But might change over time because of failture or hardware getting turned off.

Slide 18
![](.\img\exam\slides\18.PNG)
Explain link state routing.
![](.\img\38.png)
Disse pakker bliver videresendt rundt i nettet, så det ikke kun er naboerne der går dem, men alle, aka flooding. Men det er derfor vi har *seq* nummer der er løbenummer, og *age* der gør at pakken ikke bliver sendt videre efter et stykke tid. (dør) 

Internettet er bygget op som et træ/hiraki struktur så hele nettet ikke bliver flooded af LSP. Ligesom når man kører, kører man på motervejen selvom der måske er en kortere vej.

### Representation of routing tables - compact form
<span style="color:red">??? </span>

# Question 3: Transport Layer
Question: **Explain how we can build a reliable ordered connection using an unreliable connectionless network [CN6]**
**In the presence of possibility of package loss, duplication and reordering, how do we handle connection establishment, connection termination, ensure ordering and reliability? What is the purpose of the sliding window protocol and what affects the window size? What is the purpose of "slow start" in TCP?**

Transport layer is lvl 4 OSI: TCP and UDP. The transport layer is the first layer that handles data loss.

Maybe slide 25 as intro?

TPDU (Transport Protocol Data Unit) is a message encapsulation format where there are several bytes of routing header added to the front of the payload message. The processing overhead of the TPDU has two components: the overhead TPDU and the overhead per byte

### In the presence of possibility of package loss, duplication and reordering, how do we handle connection establishment, connection termination, ensure ordering and reliability?

![](.\img\exam\slides\26.PNG)
Teorien bag, men kommunikationen er baseret på pakker.

<span style="color:red">Noget om at pakker bliver numereret? </span>

Slide 27-31

![](.\img\exam\slides\27.PNG)
Forklar three-way handshake

![](.\img\exam\slides\28.PNG)
a) gammel eller ugyldig CR pakke: host godkender ikke ACK, da den ved at "seq" ikke passer. b)  både gammel og ugyldig CR og DATA: her passer både "seq" og ACK ikke.

Nogle gange er der processer der ikke gør dette ordenligt og så er der implementeret timeouts der håndterer dette.

![](.\img\exam\slides\29.PNG)
Her tror Host 1 at den har sendt og at modtageren Host 2 har modtaget pakken, men den har allerede lukket forbindelsen og modtager ikke længere.

![](.\img\exam\slides\30.PNG)
Her sender klient en DR og når den modtager DR fra Host 2, ved den at vi er færdig da Host 1, der er klient, var den der startede samtalen/forbindelse, og så sender Host 1 en ACK for at bekræfte at forbindelsen er lukket. Dette fungerer godt så længe der ikke er pakke tab. Set på næste slide.

![](.\img\exam\slides\31.PNG)
Gennemgå dem. Måske skip slide?

### What is sliding window protocol? What affects window size?
Ideen bag sliding window er at den tester hvor mange pakker modtageren kan modtage, og justerer ud fra det.

Slide 39
![](.\img\exam\slides\39.PNG)
Modtager fortæller hele tiden for hvor data den har modtaget og hvor meget den stadig har plads til, og så sender afstender det modtager har plads til.

### Purpose of "slow start" in TCP?

Slide 41-42
![](.\img\exam\slides\41.PNG)
![](.\img\exam\slides\42.PNG)
CWND: fortæller hvor mange pakker der må være ude i netværket. Pakker forsvinder ikke i kablerne, men i devices hvis buffers er fyldte. Hvis vi taber pakker så har vi congestion.
vi doblet hele tiden antal af pakker vi prøver at sende, og på et tidspunkt skifte vi til at øge vinduet med en.
Hvis vi taber en pakke, så starter vi forfra, men med flyttet threshold.

SW: tester hvor mange pakker modtageren kan modtage.
CW: tester hvor mange pakker der kan være ude i netværket.

# Question 4: RMI
Question: **Give an introduction to the idea of RMI, and discuss the implementation principles [DS5.1-5.5].**
**What is Remote Method Invocation? Why is RMI suitable for distributed systems? What is the goal of RMI? What is a remote interface? How can it be specified? How are remote invocations different from local invocations? What is an idempotent operation? What options exists for call semantics? What is maybe invocation semantics? What is at least once semantics? What is at most once semantics? How can they be implemented? What problems arise in case of failures and concurrency? How can a distributed object system be implemented? What are the involved components? What happens step by step during a remote method invocation? What is static and dynamic invocation? What are server threads? What is java RMI (or .netRemoting) ? How are remote interfaces specified in Java RMI (or .netRemoting)? How are parameters transferred? What is the call semantics? How is the code for parameter objects transferred? What is the purpose of the registry?**

# Question 5: Distributed File System (DFS)
Question: **Discuss what is the goal of distributed files systems, and describe SUN NFS [DS12.1-12.3].**
**What is the purpose of a basic distributed file system (DFSA) ? What are the required features and areas of responsibility? What are the expected benefits? What is a file? What is a directory? What typical operations must the DFS support? What is the architecture of a typical DFS? What is a flat file service? What is a directory service? How are the typical distributed flat file service operations different from their centralized counterparts+ What is an idempotent operation? what is a stateless server? How is a file identified? What is NFS ? What typical operations are offered by the NFS protocol? What is the architecture of a NFS system? What is a file handle? How is a path name translated? What is the purpose of caching? What is server caching? What is read-ahead? What is write through? What happens in case of failure? What is client caching? What is cache consistency? How does NFS check for validity of a client cache entry? What performance bottlenecks exists in NFS?**

# Question 6: P2P
Question: **Discuss the goal of Peer-to-Peer systems, and describe how searches in a Pastry net is performed [DS10.1-10.5].**
**What is a p2p system? What are their goals? How are they different from centralized or client/server systems? What are the advantages and disadvantages of p2p systems? How are resources identified? How are nodes identified? What is overlay routing networks? What is a distributed hash table? What is the API for a DHT? How is a DHT realized in Pastry? How is routing performed? What information is contained by the routing table? What is the longest common prefix? What is a leaf set? What purpose does it serve? What is the performance of the Pastry System? How does Pastry function when nodes fail or appear/disappear dynamically? What disadvantages do you see of the pastry approach?**

# Question 7: Physical Time
Question: **Discuss algorithms to achieve clock synchronization in distributed system [DS14.1-14.3]**
**How are clocks implemented in computers? How is time represented ? what are the sources of inaccurate clocks? Why can't computer clocks not be 100% accurately synchronized? What is internal/external synchronization? How does Christians method and the Berkeley Algorithm synchronize clocks? What is the network time protocol? **

# Question 8: Logical Time
Question: **Discuss methods to order events in a distributed system [DS14.1-14.2,14.4]**
**What is logical time time as opposed to physical time time? What is causal ordering and the happens-before relation? What is Lamportclocks? How are events time stamped? What is vector clocks? What can be done with vector clocks that cannot be achieved with Lamportclocks? What can logical time be used for? What system model is assumed for the different algorithms?**

# Question 9: Security
Question: **Discuss how cryptography can be to ensure integrity and confidentiality in a distributed system [DS11 except 11.3.1-11.3.3, 11.6.4, and 11.5].**
**What are the main security goals? What kinds of threats are a distributed system subject to? Describe the difference between shared secret and public-private key cryptography. How can public-private key cryptography be used to ensure the integrity and authenticity of a message? What is a HMAC? Explain the Needham Schroeder protocol or Kerberos.**

# Question 10: Study Exercise
Question: **Choose one of the two problems below:**
- **Implement a simple web client-server using TCP. The client should be able to request a static web-page from the web-server and present the returned code on the screen (it should also work with standard web-servers). The server should be able to accept requests (HTTP GET) and return a static web-page. Remember that the server must be able to handle concurrent requests (again the server should also work if the request comes from a standard web-server).**
- **Implement a simple client-server communication protocol using UDP. The protocol should be a RRA (request reply ack) protocol and be capable of handling dropped packages, duplicate messages etc. Illustrate it with a simple bank-account application providing 3 operations: deposit, withdraw and balance.**
- **You must bring two hardcopy print-out of the code and a sample run of your program. You are requested to prepare a presentation of the problem and your solution (you may bring slides - but blackboard drawings are perfect; we recommend printing the code snaps on slides so you can give a structured code walk-through of the IMPORTANT aspects of your solution).**
- **A non-correct working implementation does not necessarily equal a non-pass grade, but some reflection on the encountered problems are especially recommended in this case.**

