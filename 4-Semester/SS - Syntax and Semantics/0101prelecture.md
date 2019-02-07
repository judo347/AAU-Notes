### Grundlæggende mængdelære

#### Matematisk induktion

Bliver brugt for at bevise sætninger på formen: *For ethvert naturligt tal k $\geq$ c gælder at....*

1. *Basistrinnet* viser at sætningen er sand for den mindste *k-værdi*, dvs. for k = c.
2. *Induktionsskidtet* viser at hvis antager at sætningen gælder for et vilkårligt k, så gælder den også for k + 1.

**Eksempel**

*For ethvert naturligt tal k $\geq​$ 1, gælder det om summen S(k) defineret ved* $S(k)=1+\dots + k = \displaystyle\sum_{i=1}^{k}i​$  at $S(k)=\cfrac{k(k+1)}{2}​$.

*Bevis*  Dette er en påstand på formen 'for ethvert naturligt tal *k* gælder ...' så vi laver induktion i *k*.

**Basistrin**: k = 1: Vi har at $\displaystyle\sum_{i=1}^{k}i=1$ og at $\cfrac{1(1+1)}{2}=1$, så resultatet gælder for basistrinnet.

**Induktionsstep**: **antag for *k*, vis for k + 1**: Her har vi som induktionsantagelse at $S(k)= \cfrac{k(k+1)}{2}​$. Vi skal nu vise at $S(k+1) = \cfrac{(k+1)(k+2)}{2}​$. Summen $S(k+1)​$ kan skrives som:

$S(k+1)=1+ \dots + k + (k+1) = S(k) + (k+1)$

Bemærk nu at de første *k* led i denne sum summerer op til $S(k)​$. Pr. induktionsantagelsen har vi at $S(k) = \cfrac{k(k+1)}{2}​$, så $S(k+1) = \cfrac{k(k+1)}{2} + (k+1)​$

Ved at indsætte på fælles brøkstreg får vi

$S(k+1) = \cfrac{k(k+1)}{2}+\cfrac{2k(k+1)}{2}=\cfrac{(k+1)(k+2)}{2}$

som var det, vi skulle vise.

**Stærke induktionsprincip** *(Variant af induktionsteknikken)*

Bruges til at vise en påstand på formen: *For ethvert naturligt tal k $\geq$ c har vi at ...*

gælder for alle *k*, gør vi følende:

1. I basistrinnet beviser vi påtanden for *k = c*.
2. I induktionsskridtet antager vi at påstanden gælder for alle  $k' \leq k$ og viser påstanden for k + 1.

#### Logisk notation

**Boolske konnektiver** $\wedge$ (og), $\vee$ (eller) og $\neg$ (ikke). 

Sandt							$2+2=4 \vee 3 + 1 = 4$

Sandt							$2+2=5 \vee 2+2=4​$

Falsk							$2+2=5 \vee 2 + 2 = 3$

**Alkvantoren** $\forall$ betyder 'for alle'.  	$\forall x. \: 2x = x+x$		*(Det for alle x gælder, at 2x er lig med x + x)*

**Eksistenskvantoren** $\exists$ betyder 'der eksisterer' $\exists y. \: y > 0$ 	*(Der findes et tal y som er skarpt større end 0)*

#### Mængder

$\N​$ er naturligetal, 

X er element i mængden A                    $x \in A​$ 

X er ikke et element i mængden A       $x \notin A$

1 er en del af mængden                       $1 \in \{ 1,2,42 \}​$

3 er ikke i mængden                              $3 \notin \{ 1,2,42\}​$

Betegner mængden af kvardrattal      $\{n \in \N \: | \: \exist i \in \N : n = i^2 \}​$ *(n er element i N, altså et naturligt tal. Der eksisterer et i der ligger i N, som er et naturligt tal, og n = $i^2​$)*

For all x, hvis $x \in A​$ så $x \in B​$              $A \subseteq B​$ *(Alle værdier i A er også i B)*

A = B                                                         $A \subseteq B$ og $B \subseteq A$

#### Operationer på mængder

Mængde operation gør det muligt at bygge nye mængder fra gamle. Lad **A** og **B** være mængder.

**Foreningsmængden** af **A** og **B**             $A \cup B = \{ x \: | \: x \in A \: eller \: x \in B\}​$ *(Eksempel: **A** = {1,2} og **B** = {2,3}. Da er $A \cup B = \{ 1,2,3\}​$)*

**Fællesmængden** af **A** og **B**                    $A \cap B = \{x \: | \: x \in A \: og \: x \in B\}$ *(Eksempel: $A=\{ 1,2\}$ og $B= \{2,3\}$. Da er $A \cap B = \{ 2 \}​$)*

**Potensmængden** af **A**                             $P(A) = \{ B \: | \: B \subseteq A\}$ *(**B** er mængden hvis elemetener alle er delmænger af **A**. Kan også skrives som $2^A$) (Eksempel: $A = \{ 1,2 \}$. Da er $P(A) = \{ \empty, \{1\}, \{2\}, \{1,2\}\}$)*

**Kartesiske produkt** eller **Krydsproduktet** af **A** og **B**           $A \times B  = \{ (a,b) \: | \: a \in A, \: b \in B\}$ *(**A** $\times$ **B** betegner mængden af ordnede par med 1.-komponent i **A** og 2.-komponent i **B**) (Eksempel: **A** = {1,2} og **B** = {2,3}. Da er $A \times B = \{(1,2), (1,3), (2,2), (2,3)\}$)*

Kartesisk produkt med 3 variabler        $A \times B \times C  = \{(a,b,c) \: | \: a \in A, \: b \in B, \: c \in C\}$

Kartesisk produkt af n-mængder           $A \times \dots A$ skriver som $A^n$

#### Relationer

En relation er en mængde af tupler, der alle er taget fra samme kartesiske produkt. 

TODOOOOOOOOOOO