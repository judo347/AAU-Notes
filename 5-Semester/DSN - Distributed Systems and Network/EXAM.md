# Random notes

<span style="color:red">Husk det tager tid at printe og øve!!!!!!!</span>

Løb over alle spørgsmål "hurtigt" og hvis der er tid til sidst, så gå i dybten med dem!

Workload:
- 5/1: 8 / 3dage = 2.667 questions per day
- 6/1 : 6/2 = 3
- 7/1: (udreget 6/1, 1 done): 5

**Status**:

- 1: Stort set done.
- 2: Stort set done.
- 3: Stort set done.
- 4: Stort set done.
- 5 DFS: 70% done
- 6: Done
- 7: Done
- 8 Logical Time: Done
- 9: Done
- 10 Study ex:

(Alle mangler at blive lavet til noter!)

# Question 1: Networking and Internetworking
Question: **Explain what a network is and how we can connect different networks together to form an internetwork [CN1].**
**Explain what a network is, the idea of protocol hierarchies and the benefits. What are the OSI and IP models and what responsibility resides at each layer? What is the difference between a connection oriented and a connectionless network? Give examples of different kinds of networks in use.**

### What is a network and examples of different types of networks

Slide 7-8

A network may contain devises like computers, printers, routers, switches and other devices connected to the network. These devices form different connections like, client-server, peer-to-peer (talks without server) and mobile users like wifi, 3G, etc..

Types:

- PAN: bluetooth, etc..
- LAN: may also include wifi, and can be called WLAN.
- MAN: Metropolitan Area Network, a city or if a datacenter has replicateded structure it would be called two MAN. 
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
Slide 13: Hver router har deres tabel, første kollonne er hvad slut destinationen for pakken er, og anden kollonne er hvor den skal sendes videre til for at komme imod destinationen. <span style="color:blue">Det er vel ip-addresser i virkerlighenden. </span>
Fejl i A's tabel (later): den kan kun sende til dem den er forbundet til. 

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

### Intro
**What is Remote Method Invocation?**
Remote method invocation tillader at kalde metoder på objekter på tværs af et netværk, semantisk ækvivalent som at det var samme maskine. 
**What is the goal of RMI?** IKKE HELT SIKKER PÅ DISSE

- At benytte existerende netværks protokoller.
- Generalisering af existerende primative typer i programmerings sprog for at understøtte udvikling af distribuerede systemer.
- Distribueret "garbage collection"
- At minimerer forskellen imellem at arbejde med lokale og "remote" objects.

**Why is RMI suitable for distributed systems?**
RMI er brugbar for distribuerede systemer fordi det gør implementering nemmere ved at abstrahere netværks delen og tillade implementering næsten som om det ikke var på tværs af netværk. 
**How are remote invocations different from local invocations?**
For klienten er der ikke forskel på "remote" og lokale "invocations", men nogle ekstra elementer er nødvendige for at både klient og server kan se hvad den anden tilbyder.

### Implementing RMI

Slide 46
![](.\img\exam\slides\46.PNG)
Gennemgå slide: Model for RMI og deres kommunikation. 

- Proxy objekter: Klasser der udgiver sig for at være lokale, men så invoker remote klasser når de bliver brugt. (Ideen fra RMI, gør remote lokalt)
- Remote reference module: ansvarlig for at oversætte til og fra lokale og "remote" objekt referencer, og for at lave referencer til "remote" objekter.
- Communication module: står for kommunikationen imellem klient og server.
- Skeleton & dispatcher: (Server side) hver process har én dispatcher, og en skeleton for hver lokal klasse.
  - Dispatcher: modtager all "request msgs" fra commiunication module, og videregiver den til det skeleton der matcher method id.
  - Skeleton: Un-marshals request og får argumenterne, invoker den tilsvarende metode, og marshals svaret og returnerer det til communication module.

Marshals: At lave en samling af "data items" (platform dependent) til en extern data representation (platform independent).

Un-marshals: Det modsatte.

### Invocation semantics

![](.\img\exam\4.PNG)

**What is maybe invocation semantics? **
**What is at least once semantics? **
**What is at most once semantics? **
**What is an idempotent operation? **
Samme resultat hvis "applied" repeatedly, w/o side effects.

### What happens step by step during a remote method invocation? 
Slide 44
![](.\img\exam\slides\44.PNG)

### Java RMI
- Define the remote interface: A remote interface provides the description of all the methods of a particular remote object. The client communicates with this remote interface.

- Develop the implementation class (remote object): We need to implement the remote interface created in the earlier step. 

- Develop the server program: An RMI server program should implement the remote interface or extend the implementation class. Here, we should create a remote object and bind it to the **RMIregistry**.

- Develop the client program: Write a client program in it, fetch the remote object and invoke the required method using this object.

- Compile the application

- Execute the application

What is java RMI (or .netRemoting)?
How are remote interfaces specified in Java RMI (or .netRemoting)? 
How are parameters transferred? 

### Registry
**What is the purpose of the registry?**
Serverne benytter dette registry til at angive deres tilgængelighed, og klienten benytter dette registry til at finde referencer til det "remote object" de vil invoke.

### What is static and dynamic invocation
Static: pre-compiled skeleton and stubs. You already know where and what you're calling.
Dynamic: makes calls to the registry to discover what services are available and how to call them. *In theory, this means that you don't need to know anything about the API.  In practice...I don't think I've ever seen anybody do this in any realistic way.*

# Question 5: Distributed File System (DFS)
Question: **Discuss what is the goal of distributed files systems, and describe SUN NFS [DS12.1-12.3].**
**What is the purpose of a basic distributed file system (DFSA) ? What are the required features and areas of responsibility? What are the expected benefits? What is a file? What is a directory? What typical operations must the DFS support? What is the architecture of a typical DFS? What is a flat file service? What is a directory service? How are the typical distributed flat file service operations different from their centralized counterparts+ What is an idempotent operation? what is a stateless server? How is a file identified? What is NFS ? What typical operations are offered by the NFS protocol? What is the architecture of a NFS system? What is a file handle? How is a path name translated? What is the purpose of caching? What is server caching? What is read-ahead? What is write through? What happens in case of failure? What is client caching? What is cache consistency? How does NFS check for validity of a client cache entry? What performance bottlenecks exists in NFS?**

### Introduction
DFS et system hvor lagring og tilgang af filer er baseret på en klient/server arkitektur. En eller flere servere lagre filer der kan blive tilgået, med de rigtige rettigheder, af klienter i netværket.
Kravene af: high transparency og performance. Transparency så dem der tilgår filerne kan gøre med dem som om de var lokalt på computeren, og performance da .......

Storage systems and their properties: DFS: Sharing, Persistence, Distributed cache/replicas, consistency maintenance.

Requirements to distributed file systems:
- Transparency: Access, location, mobility, performance, scaling.
- Concurrent file access
- Replication
- Heterogeneity of OS and hardware (understøttelse)
- Fault tolerance
- Maintaining consistency of data
- Security
- Efficiency

### File Service architecture
Slide 47
![](.\img\exam\slides\47.PNG)

Giver adgang til filer ved at strukturere file service som 3 komponenter: (Ansvar)
- Flat file service:
  -  Implementation af operationer på indhold af filer. (+ og - af: read, create, GetAttr)
  - Unique File Identifiers (UFIDs) er brugt til at refererer filer i alle "requests" for flat file service operations.
- Directory service:
  - Mapping imellem text file navne og deres UFIDs.
  - Supports tilføjelse af nye filer til mapper.
  - Operations: Lookup, AddName, UnName, GetNames.
- Client module:
  - Tilbyder integreret service til klienten. Som i at på UNIX emulerer den alle unix file operations.
  - Har også netværks lokation på serveren, og directory server processes.



Operations:

- Flat file service
  - Read(FileId, i, n): reads a sequence of up to n items from file starting at item i.
  - Write(FileId, i, Data): Write a sequence of Data to a file, starting at item i.
  - Create(): Laver en ny file med længden 0, og giver UFID for den.
  - Delete(FileId): Sletter filen fra storage.
  - GetAttributes(FileId): returnerer filens attributes.
  - SetAttributes(FileId, Attr): Setter attr af fil.
- Directory service:
  - Lookup(Dir, Name): returnerer UFID på givent navn, eller kaster exception. 
  - AddName(Dir, Name, File): Tilføjer file eller kaster exception hvis findes allerede. 
  - UnName(Dir, Name): Hvis fundet, selt, ellers kast exception. 
  - GetNames(Dir, Pattern): Retunerer alle text names i Dir der matcher REGEX pattern. 

### NFS architecture
Slide 48
![](.\img\exam\slides\48.PNG)

Network file system tillader at man mounter remote file systemer systems (or a part of it). Rettigheder kan styre tilladelser: read-only, read-write. NFS bruger Remote Procedure Calls (RPCs) til at sende requests imellem klient og server. NFS version 2 og 3, tillader UDP over IP netværk og derved skaber "stateless" netværk forbindelser imellem klienter og server. 

Stateful: Maintains a state of all open files.

Write through: klient svarer tilbage med det samme.

Idempotent operation: Samme resultat hvis "applied" repeatedly, w/o side effects.

stateless server: don't "store" data. Database og sådan ligger et andet sted.

**Operations**

![](.\img\exam\6.PNG)![](.\img\exam\7.PNG)





Slide 49
![](.\img\exam\slides\49.PNG)


What typical operations must the DFS support? 
What is the architecture of a typical DFS? 
How are the typical distributed flat file service operations different from their centralized counterparts? 
What typical operations are offered by the NFS protocol? 
What is a file handle? 
How is a path name translated? 
What is the purpose of caching? 
What is server caching? 
What is read-ahead? 
What happens in case of failure? 
What is client caching? 
What is cache consistency? 
How does NFS check for validity of a client cache entry? 
What performance bottlenecks exists in NFS?



# Question 6: P2P
Question: **Discuss the goal of Peer-to-Peer systems, and describe how searches in a Pastry net is performed [DS10.1-10.5].**
**What is a p2p system? What are their goals? How are they different from centralized or client/server systems? What are the advantages and disadvantages of p2p systems? How are resources identified? How are nodes identified? What is overlay routing networks? What is a distributed hash table? What is the API for a DHT? How is a DHT realized in Pastry? How is routing performed? What information is contained by the routing table? What is the longest common prefix? What is a leaf set? What purpose does it serve? What is the performance of the Pastry System? How does Pastry function when nodes fail or appear/disappear dynamically? What disadvantages do you see of the pastry approach?**

### Introduction
**What is a p2p system**
Et netværk hvor alle computere er "lige/peers", og lokaliseret i udkanten af netværket. Et logisk "overlay network", der ligger ovenpå et IP netværk. 

**What are their goals**

- Deling af data og resourcer på meget stor skala
  - Ingen central og separat servere -> self organised
  - Deler belastningen ved at bruge resourcer (mem. and CPU) fra "End-hosts" lokaliseret i kanten af netværket.
  - Dynamisk set af "peers"
- Privacy
- Anonymity

**P2P Types**
- Unstructured: Links in overlay created arbitrarily
- Semi-structured: p2p systemes with super-peers
- Structured: logical topology on node and data ID's (most DHT's)

### How are they different from centralized or client/server systems
- Alle "nodes" i netværket er lige og har samme ansvar. Ingen central server eller lignende
- Anonymitet og privacy

### Common issues
- Organize, maintain overlay network
  - Routing
  - Node arrivals
  - Node failures
- Resource allocation/load balancing
- Efficient placement & localization
- Locality (network proximity)

Idea: generic P2P middleware (aka "substrate"). Dette bliver håndteret af distributed hash table (DHT).

**How are resources identified**  TODOOOOOOOO
**How are nodes identified** TODOOOOOOOO

### What is a distributed hash table (DHT) IMPORTANT

DHT er det der gør at P2P netværk ikke skal bruge en server ved at uddele data over et antal nodes. DHT er et hash table der mapper en key til en value og er distribueret over et antal nodes i netværket. Hver node har en GUID (Gobally unique ID)
**Ny "content (filer, etc..)" ankommer**: Når noget nyt er tilføjet til netværket, bliver der genereret en hash key og en besked bliver sent til alle nodes der deltager i DHT. Når beskeden så når noden ansvarlig for denne key, bliver den gemt i denne node, sammen med dens value. En bruger kan så queryring hvilken som helst DHT node med en hash key genereret baseret på hvad de ønsker, og får dataen på samme måde ved at forspørgslen går fra node til node.

Pastry er en implementering af dette.

Hashing gør det hele tamperproof da man ikke kan ændre i en fil og stadig have samme hash.



### Pastry (DHT implementation)

Slide 50-52

![](.\img\exam\5.PNG)

Giver ids til nodes og bruger en virtual ring.
Leaf set: hver node kender dem/den der kommer før og efter.
Routing er baseret på "prefix matching" og er derfor log(N).
Pastry forsøger også at tage højde for den underliggende netværks topology, ved at gøre distancen imellem dem så små som muligt.
Nabo peers er lagret på følgende måde: hvis jeg har id 011101, og min nabo har 011000, så vil jeg lagre det som 011*. Som i at de første 3 bits er det samme, og resten er beskrevet med *, da fjedre bit er forskellig. Når noden skal route til en peer, finder den den nabo med den "largest matching prefix". Som i at den ser hvor mange bits, fra venstre, den kan få til at matche med en nabo. Den var flest bits fra venstre matcher, router den videre til. Hvis noden har flere naboer med samme længde matching prefix, vælger den den med "shortest round-trip-time" - denne værdi kommer fra den underliggende netværks topology (noget lignende kortest ping time).
Hvis alle nodes kende alle nodes i netværket ville der altid kun være et hop -> slide 50. Men dette gør at alle nodes skal indeholde rigtig meget data = umuligt hvis rigtig stort. Derfor indeholder alle nodes bare et givent antal naboer, og hopsne vil derfor være -> slide 51. Forklar routing ud fra de to slides.

**What is the API for a DHT**

### What information is contained by the routing table
Slide 52
GUID mapped til IP, på andre nodes end den selv. GRÅ = dens egen GUID. Så den behøver ikke at have alle fyldt ud, den vælger bare den med longest matching prefix.

### What is the performance of the Pastry System
### How does Pastry function when nodes fail or appear/disappear dynamically
Forspørgsler er bundet på hashing og ud fra værdien vælges den node der "numerical" er tættest på værdien. Så hvis en node forsvinder eller ankommer, vil systemer automatisk sende forspørgsler til den på det tidspunkt mest "relevante".
### What disadvantages do you see of the pastry approach
I can be very slow? = a lot of hops

# Question 7: Physical Time
Question: **Discuss algorithms to achieve clock synchronization in distributed system [DS14.1-14.3]**
**How are clocks implemented in computers? How is time represented ? what are the sources of inaccurate clocks? Why can't computer clocks not be 100% accurately synchronized? What is internal/external synchronization? How does Christians method and the Berkeley Algorithm synchronize clocks? What is the network time protocol? **

### How are clocks implemented in computers
Man kan købe modtagere, der kan modtage radio bølger fra satallitter, som kan forbindes til computere. Men det normale er at der i en computer sidder noget HW der tæller oscilleringer af en quartz krystal. Efter et bestemt antal af svingninger ligger uret én til et register.
Resolution are perioden imellem klokke opdateringer. 
OS vedligeholder en software klokke der er baseret på registret. 

### How is time represented
<span style="color:blue">Er besvaret i ovenstående under spørgsmål? </span>

### What are the sources of inaccurate clocks

- Resolution: Hvis to events sker med kortere tidsinterval end Resolution, kan disse ikke adskilles i tid.
- Alle quartz uret "skew"s over tid.
  - Kommer an på temperatur.

### Why can't computer clocks not be 100% accurately synchronized
Fordi urer "skew" forskellige og vil derfor over tid ikke være ens, og når urer synkroniseres, skal der kommunikeres og det kan ikke gøres "instant".

### What is internal/external synchronization
External: urerne bliver sat efter en ekstern "authoritative" source.
Internal: urerne er synkroniseret relativt til hinanden.

### How does Christians method and the Berkeley Algorithm synchronize clocks
Disse to algoritmer bliver brugt i asynkrone systemer.
#### Christians Algorithm
Client - server synkronisering. 
- Klienten sender en tidsreserverings forespørgsel til serveren. 
- Serveren returnere så dens tid. 
- Klienten måler hvor lang tid det tog. Fra SEND til SVAR MODTAGET.
- Klienten sætter så sit ur til: serverens tid + (Fra SEND til SVAR MODTAGET) /2 

Præcisheden er Fra SEND til SVAR MODTAGET /2 - minimal message delay.

- Det er ikke tilladt at justere uret tilbage i tiden.
- Og at springe frem kan også skabe problemer
- Så uret justeres langsomt over tid.

#### Berkeley Algorithm
Designed for intern synkronisering.
- Vælg en maskine om er mester (M)
- M forespørger all andre maskiner deres lokale tid.
- M udregner en gennemsnit klokkeslet baseret på de modtagne tider.
- M siger så til alle hvad de skal justerer deres ur med for at være det samme som gennemsnittet (+/-)


### What is the network time protocol
Skal vide hvad det er - behøver ikke at gå i dybten.

Synkronisering af klienter relativt til UTC, Universal Time Coordinated, på et internet-wide scale.
Pålideligt selv hvis store dele mister forbindelsen.
Tillader ofte synkronisering.


# Question 8: Logical Time
Question: **Discuss methods to order events in a distributed system [DS14.1-14.2,14.4]**
**What is logical time time as opposed to physical time time? What is causal ordering and the happens-before relation? What is Lamportclocks? How are events time stamped? What is vector clocks? What can be done with vector clocks that cannot be achieved with Lamportclocks? What can logical time be used for? What system model is assumed for the different algorithms?**

#### Introduction

**Logical time vs physical time**

Physical time har man et ur, ofte med en quartz krystal. Hvis man så har flere computere kande synkroniserer deres ure indbyrdes eller stille dem efter en ekstern kilde. Det skaber en del problemer: skew, delay on synkronising.
Logical time er baseret på viden om at nogle events sker før andre, og på den måde kan man opstille dem i rækkefølge baseret på tid. Som i at vi ikke ved hvornår dette event præcist skete, men vi ved at den kom efter denne og før denne. Dette kaldes **Causal ordering**.

**Happens-before relation**

For eksempel at sende og modtage en besked. Så ved vi at beskeden skal sendes før den kan modtages. Så derfor er forholdet i tid altid at sende kommer før modtage.



**Forklar slide 53**

![](.\img\exam\slides\53.PNG)

a->b->c->d->f, men vi ved ikke om e kommer før eller efter b!

### Lamport clocks

Lamportclocks er en måde at holdestyr på hvad der er vist på det ovenstående slide aka causal ordering. 

Fremgangsmåde:

1. En proces ligger 1 til dens counter før hvert event.
2. Når en proces sender en besked, inkluderer den dens counter værdi.
3. Når en besked modtages, sammenlignes den modfølgende counter med processens egen counter. Og processens counter updateres baseret på hvilken værdi er højst. Så ligges der en til og dette er timestamp for received msg.

Forklar fremgangsmåden ud fra exam slide med disse værdier:

![](.\img\exam\8.PNG)

### What is vector clocks

Ligesom med Lamportclocks bliver urerne sendt med beskeden imellem processerne. Alle processors ure er lagret i en vektor med størrelse lig med antal af processer. 5 processor = 5 tupel vektor.

- Alle ure starter på 0
- Ved internt event, "increments" den proces' ur i vektoren.
- Besked sendes: opdateres dens ur, altså kun en gang, og så sendes der en kopi af vektoren med beskeden.
- Besked modtages: increment own clock value, og opdater alle værdier i egen vektor med den højeste værdi fra enten den modtagne vektor eller egen.

Forklar fremgangsmåden ud fra exam slide med disse værdier:

![](.\img\exam\9.PNG)

### What can be done with vector clocks that cannot be achieved with Lamportclocks

Vector clocks kan se forskel på om to operationer er concurrent eller causally dependent. Holder mere information. 

LamportClocks kan ikke konkludere at der er "causal happend-before relation". e(1) og c(3), 1 er mindre end 3, men det betyder ikke at "e" kom før "c".

Vector clocks kan: To determine if two events are concurrent, do an element-by-element comparison of the corresponding timestamps:

- Hvis alle sæt af værdier i en vektor er størrer end værdierne i den anden, så kommer den med højeste værdier efter den med mindste værdier.
- Hvis nogle værdier er større og andre er mindre, så er de "concurrent".

e og c er "concurrent".


# Question 9: Security
Question: **Discuss how cryptography can be to ensure integrity and confidentiality in a distributed system [DS11 except 11.3.1-11.3.3, 11.6.4, and 11.5].**
**What are the main security goals? What kinds of threats are a distributed system subject to? Describe the difference between shared secret and public-private key cryptography. How can public-private key cryptography be used to ensure the integrity and authenticity of a message? What is a HMAC? Explain the Needham Schroeder protocol or Kerberos.**

### What are the main security goals
Er disse de rigtige?:
- Confidentiality: sikkere sig at den rette modtager, og kun denne, modtager beskeden/data'en. Aka, hvis en ikke godkendt person får fat i dataen kan han ikke bruge den til noget.
- Integrity: at sørge for at data'en der krypteres, sendes og modtages, er komplet. Eks. en person modtager data, og data'en kun kan dekrypteres hvis den er komplet.
- Availability: sørger for at data'en er tilgængelig til de autoriserede parter.

### What kinds of threats are a distributed system subject to
Threats:
- Eavesdropping: "Lytte" til data for at finde f.eks. en nøgle.
- Masquerading: At udgive sig for at være en anden for at få adgang.
- Message tampering: Ændre i beskeder.
- Replaying: WiFi hack, optag authentication, og gensend.
- Denial of service: Dette angreb kan bliver brugt til at lægge dele af et system ned.

### Describe the difference between shared secret and public-private key cryptography
#### Shared-secret-key crypto:
(Symmetric cryptography)
Shared secret, er et stykke data, der kun er kendt af de involverede parter. Det kan være et kodeord, et tal eller noget lignende. Det er brugt i kommunikation og enten aftalt på forhånd eller ved starten af en komminikation.

#### Public-private-key crypto:
(asymmetric cryptography)
Public keys:
- only be used to encrypt msgs

Private keys:
- used to decrypt msgs with a matching public key
- is kept secret

Public key kan blive delt ud til alle, og private key bliver holdt hemmelig. Brugere kan så kryptere data med public key og verificere digitale signaturer. Digitale signaturer kan blive lavet med private key.

**Digital signatures** - content is digitally signed with an individual’s private key and is verified by the individual’s public key

**Encryption** - content is encrypted using an individual’s public key and can only be decrypted with the individual’s private key

#### Foreskelle
Shared-secret bruger en nøgle til at kryptere og dekryptere. Public-private-key benytter en til hver.


### How can public-private key cryptography be used to ensure the integrity and authenticity of a message
![](.\img\exam\2nope.PNG)

Ved at sørge for at data'en der krypteres, sendes og modtages, er komplet. Eks. en person modtager data, og data'en kun kan dekrypteres hvis den er komplet.

Digitale signaturer.




### What is a HMAC
Hash-based message authentication code.
Hvor der bruges en hash function og en hemmelig nøgle til at verificere både data integrity og beskedens autentitet.
HMAC uses two passes of hash computation. The secret key is first used to derive two keys – inner and outer. The first pass of the algorithm produces an internal hash derived from the message and the inner key. The second pass produces the final HMAC code derived from the inner hash result and the outer key.


### Explain the Needham Schroeder protocol or Kerberos

Chosen: Kerberos

![](.\img\exam\Slides\58.PNG)

![](.\img\exam\3.PNG)

Authentication protocol for client/server applications. Purpose: security and authentication.

Formål: undgå at kodeord bliver aflyret (eavesdropping), og samtidig give authentication til brugere.

1: 

- Request er enkrypteret med brugers shared-secret-key. 
- KDC, har også denne key, og verificere brugeren.

2: svaret brugeren får tilbage er krypteret med en anden key, som kun KDC kender.

3: Dekrypterer så beskeden med KDC key.

4: Server ticket er enkrypteret med en 3. key, som kun KDC og Server S, kender.

5: Server S, verificerer så brugerens token med den key der er kendt af S og KDC.

6: Hvis godkendt, får brugeren en session key, der giver brugeren adgang i et stykke tid.




# Question 10: Study Exercise
Question: **Choose one of the two problems below:**
- **Implement a simple web client-server using TCP. The client should be able to request a static web-page from the web-server and present the returned code on the screen (it should also work with standard web-servers). The server should be able to accept requests (HTTP GET) and return a static web-page. Remember that the server must be able to handle concurrent requests (again the server should also work if the request comes from a standard web-server).**
- **Implement a simple client-server communication protocol using UDP. The protocol should be a RRA (request reply ack) protocol and be capable of handling dropped packages, duplicate messages etc. Illustrate it with a simple bank-account application providing 3 operations: deposit, withdraw and balance.**
- **You must bring two hardcopy print-out of the code and a sample run of your program. You are requested to prepare a presentation of the problem and your solution (you may bring slides - but blackboard drawings are perfect; we recommend printing the code snaps on slides so you can give a structured code walk-through of the IMPORTANT aspects of your solution).**
- **A non-correct working implementation does not necessarily equal a non-pass grade, but some reflection on the encountered problems are especially recommended in this case.**

