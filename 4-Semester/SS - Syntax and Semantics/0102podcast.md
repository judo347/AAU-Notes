## Afsnit 1

Læringsmål: 

- Grundlæggende begreber om sprog. 
- Endelige automater (Simpel beregningsmodel for leksikalsk analyse). 
- Forstå regulære spog (og operationer på dem). 
- Aflukning under foreningsmængde. Produktkonstuktion.



### Sprog

Sprog = mængde er strenge.

**Definition** (Alfabet)

Et alfabet er en endelig mængde af tegn.

**Eksempler**

A = {a,b,c,d...,å} (DANSK)

B = {0,1} (Binære alfabet)



**Definition** (Streng)

Givet et alfabet $\sum$, er en streng over $\sum$ er en endelig følge af tegn over $\sum$.

Strenge har en længde. Givet en streng s, betegner vi |s|. 

**Eksempel**

Streng over A, kunne være abe, kpst, en følge af bogstaver.

Streng over B, kunne være 01001, 100.

En lille streng: $\varepsilon$ (den tomme streng)

|abe| = 3, |$\varepsilon​$| = 0.

**Definition** (Sprog)

Givet alfabet $\sum$, er et sprog over $\sum$ er en mængde af strenge over $\sum$.

**Eksempler**

Alfabetet A:  (L står for language, de følgende eksempler er sprog lavet ud fra alfabet A) $L_1 = \{ a,aa,bba \}$, $L_2 = \{ a,aa,aaa, ... \}$, $L_3 = \empty$ (Det tomme sprog)

**HUSK**: $\varepsilon$ er den tomme streng, $\empty$ er det tomme sprog. IKKE DET SAMME.

## Afsnit 2

**Definition**

Lad $\sum$ være et alfabet. $\sum^*$ er sproget bestående af **alle** strenge over $\sum$.

$\sum^*$ er altid et uendeligt sprog.

**Eksempel**

$\sum = \{0,1\}$

$\sum^* = \{ \varepsilon, 0, 1, 00, 01, 10, 11, 000, 001, ...\}$

**Definition** (Konkatination? - Sammensætning af strenge)

Lad *u* og *v* være strenge over $\sum$. $(u \in \sum^* , v \in \sum^*)$. Så er $u \: \circ \: v$ (tit skriver vi *uv*) er strengen bestående af sumbolerne i *u* efterfulgt af sumbolerne i *v*.

**Eksempel**

u = abc, v = hat, uv = abchat.

u = kat, v = $\varepsilon$, uv = kat.

**HUSK** Et strog er bare en mængde af strenge.  Så vi kan bruge alle de sædvanlige mængde operationer så længe de igen giver os et sprog. Vi kan skrive: 

- $ L_1 \cup L_2 = \{ x | x \in L_1 \or x \in L_2\}​$
- $ L_1 \cap L_2 = \{ x | x \in L_1 \and x \in L_2\}$
- $ L_1 \setminus L_2 = \{ x | x \in L_1 \and x \notin L_2\}$ (Minus)

**Men** $L_1 \times L_2$ giver ikke mening.

## Afsnit 3 - Endelige automater - grundlæggense ideer.

Model af neuroner (Dem i hjernen). I dag bliver endelige automater andvent til leksikalsk analyser (lexer). Og også i specifikation of simple systemer.

Endelig automater er simple algorithmer til sproggenkendelse. Vi ønsker at svare på spørgsmålet: "Givet w, har vi w $\in$ L?". w = streng, L = sprog. 

En endelig automat er en orienteret graf. Knuderne er tilstade, kanter er transvitioner eller overgange. 

**Eksempel**

En af tilstandene er det vi kalder start-tilstanden, den hvor den første pil peger ind til en knude. Kanterne er mærket med tegn, kan have en eller flere. Når første tegn i input strengen læses er vi i start tilstanden. Herefter læser man et tegn efter det andet og bevæger sig rundt i den endelige automat. Hvis vil til sidst ender i en accept-tilstand er input accepteret, hvis ikke er input ikke accepteret.

![](.\img\1.png)

**Eksempel** (Her laves en automat der kun godkender strenge med et bestmet format)

Måden man tegner på: Vi skal have en start knude. Og så tegner man hvad der gør en gladere indtil man er i accept-tilstand.

![](.\img\2.png)

## Afsnit 4 - Formel difinition of endelig automat

![](.\img\3.png)

3:39