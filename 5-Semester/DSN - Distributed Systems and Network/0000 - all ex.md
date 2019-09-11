# 1 - Introduction

#### Ex 1

**[CN] 1.3 (1.2) The performance of a client-server system is strongly influenced by two major network characteristics: the bandwidth of the network (that is, how many bits/sec it can transport) and the latency (that is, how many seconds it takes for the first bit to get from the client to the server). Give an example of a network that exhibits high band- width but also high latency. Then give an example of one that has both low bandwidth and low latency.** 

High bandwith and high latency: 

- The internet connection from Denmark to USA? It has relative high latency because of the distance, and high bandwith because it runs through main internet cables.
- So generally: long geographical distance, but good cables.

Low bandwith and low latency

- My LAN network? The network deviced only supports low bandwith, but but my pc and server is on the same network which results in low latency.
- So generally LAN networks with low bandwith hardware. (Cables, switches, routers..)

#### Ex 2

**[CN] 1.4 (1.3) Besides bandwidth and latency, what other parameter is needed to give a good characterization of the quality of service offered by a network used for (i) digitized voice traffic? (ii) video traffic? (iii) financial transaction traffic?**

I: Digitized voice traffic (VoIP)

- Stable connection, to avoid packet loss?

II: Video traffic

- If it is live, the connection should be stable. But if it is streamed it could just use a buffer to avoid lacking out.

III: financial transaction traffic

- Has to be a secure line. VPN or something like that?

#### Ex 3

**[CN] 1.10 (1.10) What are two reasons for using layered protocols? What is one possible disadvantage of using layered protocols?**

Advanteges: 

- 1 - Each layer can freely add data without taking the other layers/data into a count. 
- 2 - Pretty easy implementation?

Disadvanteges:  

- 1- increased data usage, no resuse of bits, adds more info/data again and again. 
- 2- wasted resources packing and unpacking?

#### Ex 4

**[CN] 1.16 (1.18) A system has an n-layer protocol hierarchy. Applications generate messages of length M bytes. At each of the layers, an h-byte header is added. What fraction of the net- work bandwidth is filled with headers?**

Number of layers = **n**, each layer adds **h** bytes, lenght/size of "raw" msg = **M** bytes.

Each message has **n * h** bytes added. The total lenght of the of the msg with added bytes is **M + n * h**.

Fraction of bandwith filled with headers = **((n * h) / M + n * h) * 100**

Example: n = 5 = number of layer protocols, M = 10 = bytes of msg, h = 1 = byte of each header. Fraction of bandwith filled with headers = **((n * h) / M + n * h) * 100 = ((5 * 1) / 10 + 5 * 1) * 100 = 33.33..**



# 2 - Media Access Control and Internetworking

#### Ex 1

**[CN] 4.3 (4.3) Consider the delay of pure ALHOA vs slotted ALOHA at low load. Which one is less? Explain your answer**

The graph on the slides says that slotted ALOHA is always better at handling loads then pure ALOHA - at low load, they are the same. 

At low load, they perform equally good. The pure one will sometimes make collisions, but this should rarely happens since the load is low. The slotted one will also sometimes make collisions, but this is detected earlier then the pure one.

#### Ex 2

**[CN] 4.15 (4.15) A 1-km-long, 10-Mbps CSMA/CD LAN (not 802.3) has a propagation speed of 200 m/μsec. Repeaters are not allowed in this system. Data frames are 256 bits long, including 32 bits of header, checksum, and other overhead. The first bit slot after a successful transmission is reserved for the receiver to capture the channel in order to send a 32-bit acknowledgement frame. What is the effective data rate, excluding overhead, assuming that there are no collisions?**

