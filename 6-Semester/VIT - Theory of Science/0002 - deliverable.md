# Exercise 1

- H1 The probability that a student gets question 1 right is 50%
- H2 The average total that students obtain is less than 50 points.
- H3 BLA students get better exam results than CRU students
- H4 Question 5 is more difficult than question 8

## A. For each of the four hypotheses:

### Determine whether it is a one sample performance hypothesis, or a two-sample comparative hypothesis

**H1**: one-sample: it's a hypothesis about performance.

**H2**: one-sample: it's a hypothesis about performance.

**H3**: two-sample: the hypothesis makes a comparison between BLA students and CRU students.

**H4**: two-sample: the hypothesis makes a comparison between two questions.

### Perform a preliminary investigation of the plausibility of the hypothesis using descriptive analysis tools (boxplots, histograms, biplots, . . . )

![](.\img\4.png)

**H1**: Based on the bar diagram above - it seems like the hypothesis is plausible. The probability that a student gets question 1 right is around 50%.

![](.\img\8.png)

**H2**:  The box plot above is based on the total score of all students. We can see that the median score is higher than the 50 points which the hypothesis claims that students have less than, so it seems like it is not plausible.

![](.\img\6.png)

**H3**: Based on the bar diagram above - the hypothesis does not seem to be plausible. The above diagram is based on the total average score of each set of students, and in this case, they are pretty even. And if anything, based on the data, CRU gets a slightly higher score on average.

![](.\img\7.png)

**H4:** Based on the bar diagram above - the hypothesis seems to not be plausible at all. Student, on average, gets a much higher score in question 5 then question 8, which leads to the assumption that the harder question of the two is question 8.

## B. For H1 and H2

Notes: 

- Binomial Test (17-24)
  - A binomial test examines if some population proportion is likely to be x.
  - parameters: N = number of cases, p = probability of the desired outcome
    - Ex: N = 20, p = 0.5: 
  - You scale the number of test cases up until you with the equation get a very small p-value. At that point you know you have a reasonable about of data to tests the hypothesis.
  - Set at what value you will reject the hypothesis before starting the data analysis: $\le \alpha$
  - One-sided: "upper/lower bound" hypothesis, such as: $p \le 0.5$
  - Two-sided: "point" hypothesis, such as: $p = 0.5$
- t-Test (25-31)
  - Use to compare two given samples
  - A t-test is used when the population parameters (mean and standard deviation) are not known.

### Identify a statistical test that is suitable to test the hypothesis

**H1**: I would like to apply a Binomial test for this hypothesis. This test has the purpose of estimating the probability of a specific outcome, which in this case is, that the chance of a student answering question one correctly is 50%.

**H2**: I would like to apply a t-Test for this hypothesis. 

### Apply the test to the vitdata and determine whether the hypothesis is rejected at a significance level of 0.01.

**H1**: Using the calculator at [link](https://www.socscistatistics.com/tests/binomial/default2.aspx), and entering the following values; 

- $n$, which is the number of cases, is it to 300.
- $K$, which is the number of occasions the actual outcome occured, which in this case is the number of times the answer to the question was correct, is 156.
- $p$, being the probability the outcome will occur on any particular occasion, is initially set to $50\% = 0.5$. This value is only correct if we assume that every student answers at random. 

![](.\img\11.png)

Using the before mentioned numbers we get the result at the above picture. The probability values renders the data unusable. If we re-evaluate the entered values, we find that the value $p$ is only accurate if each student answers completely random. If we assume that most students has studied for the test, and that each student will make a qualified answer, we can increase the chance of a correct answer, the value $p$. If we increase the value to $60\% = 0.6$, we get the following result:

![](.\img\10.png)

This result makes us not reject the hypothesis because the significance level is  $p < 0.01$



**H2**: I use the calculator at [link](https://www.socscistatistics.com/tests/tsinglesample/default2.aspx). The *population mean* is the 50 points in the hypothesis and *sample X* is each students total score. 

![](.\img\9.PNG)

The significance level is at 0.01 and the hypothesis is therefore rejected.

# Exercise 2

## C. For hypotheses H3 and H4 from Exercise 1:

- H3 BLA students get better exam results than CRU students
- H4 Question 5 is more difficult than question 8

### Identify a statistical test that is suitable to test the hypothesis

**H3**: I would apply a T-Test to test the probability that BLA students gets better results than CRU students.

**H4**: I would apply a Binomial test.

### Apply the test to the vitdata and determine whether the hypothesis is rejected at a significance level of 0.01.

**H3**: Using the calculator at [link](https://www.socscistatistics.com/tests/studentttest/default2.aspx), and entering the following values:

![](.\img\14.PNG)

Treatment 1 is the total scores of all CRU students, and Treatment 2 is the total scores of all BLA student.  

The result of the calculation is:

<center><i>The t-value is 0.77286. The p-value is .440218. The result is not significant at p < .01.</i></center>



Based on the **p** value, I would not reject the hypothesis.



**H4**: Using the calculator at [link](https://www.socscistatistics.com/tests/binomial/default2.aspx), and entering the following values; 

- $n$, which is the number of cases, is it to 300.
- $K$, which is the number of occasions the actual outcome occurred, which in this case is the number of times a student scores less points in question 5 compared to question 8. This happened 77 times.
- $p$, being the probability the outcome will occur on any particular occasion, is set to $50\% = 0.5$. This value is only correct if we assume that each question is equality hard.

![](.\img\12.png)

Using the above numbers results in a significance level below 0.01 and the hypothesis is therefore not rejected.

## D. Define yourself 4 new hypotheses about the students and exam questions in vitdata, such that you have one hypothesis each with the following characteristics:
#### Define 4 hypotheses

One sample, and can be tested with Binomial test:

- M1 The probability that a student gets question 1-4 right is 50%

One sample, and can be tested with the one sample t-test

- M2 The average score of question 5-8 is more than 15 points

two sample, and can be tested with the two sample t-test

- M3 The average score of question 5 and 6 is higher than the average score of question 7 and 8

two sample, and can be tested with the Wilcoxon test

- M4 Given 100 students from each program which has the highest total score, CRU will have the highest average score.

#### For each hypothesis, perform a preliminary analysis using descriptive statistics, and based on this analysis, decide whether you think the hypothesis should be A: not rejected, B: rejected, or C: very clearly rejected (with a p-value < 0.00001)

![](.\img\15.png)

**M1**: Based on the above bar chart I think the hypothesis should be: C: very clearly rejected.

**M2**: If we for each student take the average of their scores on question 5-8, and calculate the average of all this for all students combined, we get the value: **10**. The value is significant lower then 15, so I think it should be: B: rejected.

**M3**: From the given vitdata we can calculate the following:

- The average score for question 5 and 6 is **10.985**
- The average score for question 7 and 8 is **9.053333333333333**

The average score for question 5 and 6 is higher, but the difference is too small to make any conclusions. I would think that B: the hypothesis would be reject.

**M4**: From the given vitdata we can calculate the following:

- The average total score of top 100 students from CRU is **47.41**
- The average total score of top 100 students from BLA is **45.94**

Based on these calculations I think the hypothesis will be: B: rejected.



#### Apply a suitable statistical test to your hypotheses, and check whether the result of the test corresponds to your expectation.

**M1**:

![](.\img\16.png)

Based on the above values we should reject as my expectations were.

**M2**:

![](.\img\17.png)

With the above number the result is: $t-value = -31.65222$ and $p < .00001$. So the hypothesis should be rejected. This was my expectation.

**M3**: 

![](.\img\18.png)

Entering the above numbers into the T-Test calculator gives the following results: $t-value = 5.94806$ and $p-value < .00001$. So the hypothesis should be rejected. This was my expectation.

**M4**: 

![](.\img\19.png)

The above numbers results in the following: $z=-6.3334$, $p<.00001$ and $W=331.5$. So the hypothesis should be rejected. This was my expectation.

# Exercise 3

I have chosen a project which I am currently working on in my spare time. The idea came from playing the game *Escape from Tarkov* which contains a large number of quests that the player has to complete. Each quest has some objectives which are descripted using a mix of lore and dialog. This makes it very hard to understand the specifics required to complete the quest and often the player finds himself browsing the Wikipedia and other external sources to make sense of the in-game quest description. The process is time consuming and often leaves you with a lot of confusing notes and time wasted not playing the game.

### Purpose of the system and performance measures

The purpose of the application is to track the players quest progression throughout the game, and display all objectives in each quest as specific as possible, with the purpose of making each quest as easy as possible to complete.

The best performance measure for measuring the quality of my system could be how many quests can be completed without using external resources. To be specific: given a user has completed all quests in the game - what percentage of quests were completed without using any other information than what is available in the game and in my application. 

### Would there be an alternative, existing solution to which you could compare your solution?

There is not any other applications which does this, but it could be compared to the Wikipedia for the game. So what percentage of the quests can be completed without using any other information then what is in the game.

### How do you set up an experiment to collect empirical data for the comparison?

I would get two groups of people to play the game trying to complete each quest. One group would only use the information in the game, and the other group would use my application and the information provided by the game. I would then record how many quests each person in each group was able to complete with the given information.

### State precisely a null hypothesis you would like to test. Which of the tests described in the lecture would be suitable for testing your hypothesis based on your data? If none of them seems applicable, in what respect do these tests not fit your data or your hypothesis?

The null hypothesis that I would like to test is: 

<center><b><i>There is no statistically significant relationship between the amount of quests completed by a player using my application and a player that does not.</i></b></center>

I would use a two sample t-test, to test the hypothesis.

