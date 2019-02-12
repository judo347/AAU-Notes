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

## Afsnit 3

