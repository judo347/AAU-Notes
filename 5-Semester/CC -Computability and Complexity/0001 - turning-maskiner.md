# 1 - Turing-maskiner

Termer: genkendelighed og afgørbarhed.

![](.\img\1.png)

Genkendelighed = skal acceptere en string, og må ellers gerne gå i uendelig løkke.

Afgørbarhed = skal standse i en accept-tilstand ved alle input strenge i sproget.

#### Afsnit 1

![](.\img\2.png)

Turing-maskiner består af et **bånd**, der har en start og er udendelig langt. Båndet er delt ind i felter hvor der på endelig mange af dem står tegn forskelligt fra det tomme tegn, og på resten står der det tomme tegn. Turen-miskinen har også en endelig kontrol, den har en **viser** der peger på den **nuværende tilstand**, og en **læsehovede** der kan **læse et felt af gangen**. Dette **læsehovede** kan bevæge sig et felt **frem eller tilbage og læse feltet**.

![](.\img\3.png)

![](.\img\4.png)

Første felt: $(q_0 ,a,R)$ = Hvis vi står i tilstand $q_0$ og ser et *a*, så bliver vi i tilstand $q_0$, vi bliver ved med at have et *a* på vores felt, og vi flytter læsehovedet til højre. **(gå til, skriv til felt, ryk læsehovede)**.

![](.\img\5.png)

![](.\img\6.png)

 ![](.\img\7.png)

#### Afsnit 2 - Beregning og accepteret beregning

Konfirguration er et øjebliks billede under en beregning.

![](.\img\8.png)

Givet en TM (turing-maskine) M...

![](.\img\9.png)

![](.\img\10.png)

![](.\img\11.png)

![](.\img\12.png)

![](.\img\13.png)

![](.\img\14.png)

![](.\img\15.png)

![](.\img\16.png)

 #### Afsnit 4: Topotens-sproget er afgørbart

![](.\img\17.png)

![](.\img\18.png)

![](.\img\19.png)

![](.\img\20.png)

#### Afsnit 5

![](.\img\21.png)

![](.\img\22.png)

