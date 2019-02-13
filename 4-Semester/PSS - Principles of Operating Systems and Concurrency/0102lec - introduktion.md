# Introduktion

Handler meget om **Embedded systems** og **Styresystemer**, som findes i AMT, IoT og mange andre steder. Kurset handler om de **ideer/koncepter** der bliver brugt / er blevet brugt til at udvikle styresystemer.

Efter hver kursusgang, check op på om man ved hvor det nuværende emner bliver brugt i et styresystem.

XV6 - legetøjs styresystem brugt i undervisningen. Sørg for at kigge på koden for at forstå begreber.

EXAM: Man trækker spørgsmål og så viser man hvor i XV6's kode dette spørgsmål er gældende, derefter snakker man ud fra det. Mest bare for at komme igang. Kode kan dog undgås, man anbefales ikke.

EXAM: De 10-12 emner bliver offentliggjort inden exam.

**Memory management** algorithmer skal læres uden ad.

### Example:

```
ch = fgetc(stdin);
fputc(ch, stdout);
```

Programmet som udgangspunkt ligger på **harddisk** (sekondær hukommelse).. **OS** skal loade programmet op i **RAM** (Primær hukkommelse). Det bliver langt et sted det kan findes. **Compiler** laver filen til maskinkode (1'er og 0'er (PE eller ELF format)). Koden i RAM organiseres often sådan: top -> Stack, Heap, Data, Kode <- button.  Data er statiske variabler og andet tekst der ikke ændre sig. Lokale variabler ligger på stakken. Heap er til arrays og andet der bliver lavet på runtime hvor størrelsen ikke er kendt forinden. HEAP = malloc, alloc, free.

**Process** (kørende program) er det kørende program og alt tilhørende data som bliver oprettet til at holde styr på programmet (systemkald og meget mere). Retur værdier fra programmer bliver lagt på stacken og i vores processor er der en stack pointer til at holde styr på det. **Procrosser** indeholder en masse registre til at holde styr på programmet (Stack frame,  Program status word? (PSW), basis adresse register (holderstyr på offset til processer), limit/base bound - holder styr på allokering til processen). Hvis der opstår fejl under udførsel af programmet signaleres det med FLAG, som ligger i processoren, eller processoren har en pointer til en. Hvis der ikke er plads i RAM kan en procress (kørende program) ligges ned i HDD. **Offset** så kald der høre til en process kalder ikke en andresse direkte, men gør offset+andresse, så hvis programmet flyttes vil den rigtige andresse stadig blive ramt, da offset har ændret sig under flytning. I CPU'en kører der en løkke som er hjertet af det hele, IFetch-løkken (Intructions-Fetch loop). CPU indeholder programmering sproget microkode, som paser og excecutes instructions, this can be replaced and updatedes (CPU firmware). I CPU'en ligger der et lille styresystem der køre altid. CPU's loop kan modtage **Interrupts** der indikere at vi skal stoppe hvad vi har gang i og gøre noget andet. **Interrupts** kan komme fra mange eksterne ting (eksternt fra CPU), såsom keyboard eller andet. Når CPU'en modtager sådannet et Interrupt kald slår den op i **Interrupt-vector** som ligger i RAM for at se hvilken andresse der skal afvikles som det næste da den tidligere nu er blevet interrupted. 

**OS** er ikke en process, der ligger som biblioteks kode. OS koden ligger i RAM og skal kunne findes hele tiden. Denne kode indeholder: kerne moduler, driver, scheduler, alt kode der omhandler at læse/skrive/åbne filer, . CPU kerner kan få en **Halt** kald og lukkes derved. CPU'en indeholder flere ringe. Lad os sige to: **kernel mode** og **user mode**. Processer der køres til kernel mode har adgang til alt, så dette vil være OS. Processor der køres i user mode kan ikke adgang til halt og andre "farlige" kald/processor. Et program der kører i user mode der gerne vil benytte sig af OS laver et system-kald. Fastgjort til CPU er der en **clock** der sender et interrupt til CPU når der er gået noget tid. Schedular ved hvad der skal køres som det næste. 

![](.\img\1.jpg)