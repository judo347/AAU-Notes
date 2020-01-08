Valgt opgave: TCP webserver.

Vise, at en TCP socket-server står og lytter på inkommende connections og fork'er en ny socket af på hver ny connection, så man ender med en struktur der ser nogenlunde sådan her ud:

```pseudocode
sock = socket.socket(options, whatever)
sock.listen()
while True:
    new_connection = sock.accept()
    # skyd en ny thread af som håndterer denne nye connection for at lave multi-threading f.eks.
     threading.Thread(target=handle_client, args=new_connection).start()

# + alt det andet perifære
```





DSN OPG:

**Implement a simple client-server communication protocol using UDP. The protocol should be a RRA (request reply ack) protocol and be capable of handling dropped packages, duplicate messages etc. Illustrate it with a simple bank-account application providing 3 operations: deposit, withdraw and balance.**