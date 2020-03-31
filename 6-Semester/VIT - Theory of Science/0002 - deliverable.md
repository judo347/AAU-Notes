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

**H2**:  The box plot above is based on the total score of all students. We can see that the average score is higher than the 50 points which the hypothesis claims that students have less than, so it seems like it is not plausible.

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
  - You scale the number of test cases up until you with the equiation get a very small p-value. At that point you know you have a reasonable about of data to tests the hypothesis.
  - Set at what value you will reject the hypothesis before starting the data analasis: $\le \alpha$
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



**H2**: I use the calculator at [link](https://www.socscistatistics.com/tests/tsinglesample/default2.aspx). The population mean is the 50 points in the hypothesis and *sample X* is each students total score. 

![](.\img\9.PNG)

The significance level is at 0.01 and the hypothesis is therefore rejected.

