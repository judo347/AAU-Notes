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

