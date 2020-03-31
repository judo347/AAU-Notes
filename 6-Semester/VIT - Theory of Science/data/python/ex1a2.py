import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

class DataObject:
	program = None
	gender = None
	q1 = None
	q2 = None
	q3 = None
	q4 = None
	q5 = None
	q6 = None
	q7 = None
	q8 = None
	total = None

	def __init__(self):
		program = None
		gender = None
		q1 = None
		q2 = None
		q3 = None
		q4 = None
		q5 = None
		q6 = None
		q7 = None
		q8 = None
		total = None

	def to_string_print(self):
		print(str(self.program) + str(self.gender) + str(self.q1) + str(self.q2) + str(self.q3) + str(self.q4) + str(self.q5) + str(self.q6) + str(self.q7) + str(self.q8) + str(self.total))


# Results of question #1. T/F compare %
def ex1a2h1():
	data_array = parseFile()

	true_count = 0
	false_count = 0

	index = 0

	results_string = ""
	results_array = []
	for data_obj in data_array:
		results_string += (str(data_array[index].q1)) + ","

		if str(data_array[index].q1) is "1":
			true_count += 1
		else:
			false_count += 1

		results_array.append(data_array[index].q1)
		index += 1

	print("H1: Number of correct answers: " + str(true_count) + " Number of wrong answers: " + str(false_count))
	print(results_string)

	# Plotting
	objects = ("Correct", "Wrong")
	y_pos = np.arange(len(objects))
	performance = [true_count, false_count]

	plt.bar(y_pos, performance)
	plt.xticks(y_pos, objects)
	plt.ylabel("Number of answers")
	plt.title("Results of Question 1")

	plt.show()

# The average total that students obtain is less than 50 points.
#
def ex1a2h2():
	data_array = parseFile()

	totals_results_array = []
	index = 0
	string_results = ""
	for data_obj in data_array:
		string_results += data_array[index].total + ","
		totals_results_array.append(data_array[index].total)
		index += 1

	totals_results_array.sort()
	print(totals_results_array)
	print("HERE: " + string_results)

	# FIG 1
	#fig, ax = plt.subplots()
	#ax.plot(totals_results_array)
	#plt.show()

	totaled = []
	current_value = totals_results_array[0]
	current_value_counter = 1

	for elem in totals_results_array[1:]:
		if elem == current_value:
			current_value_counter += 1
		else:
			totaled.append([current_value, current_value_counter])
			current_value = elem
			current_value_counter = 1

	print(totaled)

	#objects = ("Correct", "Wrong")
	objects = []
	y_pos = np.arange(len(totaled))
	#performance = [true_count, false_count]
	performance = []
	for elem in totaled:
		objects.append(elem[0])
		performance.append(elem[1])

	#plt.bar(y_pos, performance)
	plt.bar(y_pos, performance)
	plt.xticks(y_pos, objects)
	plt.ylabel("Number of answers")
	plt.title("Results of Question 1")

	sigma = 15
	mu = 100
	bins = 50
	y = ((1 / (np.sqrt(2 * np.pi) * sigma)) * np.exp(-0.5 * (1 / sigma * (bins - mu)) ** 2))

	#plt.plot(y_pos, performance, 'r--')
	plt.plot(y_pos, y, 'r--')

	plt.show()

	#fig, ax = plt.subplots()
	#ax.plot(y_pos)

	#plt.show()

	fig, ax = plt.subplots()
	n, bins, patches = ax.hist(performance)
	#bins = ax.bar(y_pos, performance)
	#ax.plot(bins, y_pos)

	#plt.show()

	plt.subplot(212)
	plt.plot(y_pos, performance, 'r--')
	plt.show()

# Average of score total of each (CRU and BLA). Make box plots
def ex1a2h3():
	data_array = parseFile()

	CRU_count = 0
	BLA_count = 0
	CRU_summed = 0
	BLA_summed = 0

	index = 0
	for data_obj in data_array:

		print(data_array[index].program[0:3])
		print(str(data_array[index].total))
		if str(data_array[index].program) == "CRU":
			print("CRU found!")
			CRU_count += 1
			CRU_summed += int(data_array[index].total)
		elif str(data_array[index].program) == "BLA":
			print("BLA found!")
			BLA_count += 1
			BLA_summed += int(data_array[index].total)
		else:
			print(RuntimeError())

		#results_array.append(data_array[index].q1)
		index += 1

	print("H3: sum of CRU:count " + str(CRU_summed) + ":" + str(CRU_count) + "sum of BLA:count " + str(BLA_summed) + ":" + str(BLA_count))
	CRU_total_average = CRU_summed / CRU_count
	BLA_total_average = BLA_summed / BLA_count
	print("CRU average: " + str(CRU_total_average) + " BLA average: " + str(BLA_total_average))

	# Plotting
	objects = ("CRU", "BLA")
	y_pos = np.arange(len(objects))
	performance = [CRU_total_average, BLA_total_average]

	plt.bar(y_pos, performance)
	plt.xticks(y_pos, objects)
	plt.ylabel("Average total score")
	plt.title("Exam result, CRU vs BLA")

	plt.show()

# Question 5 is more difficult than question 8
# Both questions award 0-25 points. Average all scores on each question and make two bars in a chart. Like first H1 chart.
def ex1a2h4():
	data_array = parseFile()

	q5_count = 0
	q8_count = 0
	q5_summed = 0
	q8_summed = 0

	index = 0
	for data_obj in data_array:

		q5_summed += int(data_array[index].q5)
		q8_summed += int(data_array[index].q8)

		q5_count += 1
		q8_count += 1

		index += 1


	print("H4: q5: sum:count " + str(q5_summed) + ":" + str(q5_count))
	print("H4: q8: sum:count " + str(q8_summed) + ":" + str(q8_count))
	q5_average = q5_summed / q5_count
	q8_average = q8_summed / q8_count
	print("q5 average: " + str(q5_average) + " q8 average: " + str(q8_average))

	# Plotting
	objects = ("Question 5", "Question 8")
	y_pos = np.arange(len(objects))
	performance = [q5_average, q8_average]

	plt.bar(y_pos, performance)
	plt.xticks(y_pos, objects)
	plt.ylabel("Average score")
	plt.title("Difficulty of Question 5 vs 8")

	plt.show()


def ex2ch4():
	data_array = parseFile()

	q5_lower_than_q8_counter = 0

	index = 0
	for data_obj in data_array:
		if int(data_array[index].q5) < int(data_array[index].q8):
			q5_lower_than_q8_counter += 1

		index += 1

	print("ex2h4: The times the score of q5 were lower than q8 happend: " + str(q5_lower_than_q8_counter))

def ex2ch3():
	data_array = parseFile()

	BLA_scored_higher_than_CRU_average = 0

	index = 0
	for data_obj in data_array:
		if str(data_array[index].program) == "BLA":
			if int(data_array[index].total) > 55:
				BLA_scored_higher_than_CRU_average += 1

		index += 1

	print("ex2h4: The number of times a BLA scored higher than the CRU average of total score (55): " + str(BLA_scored_higher_than_CRU_average))

def ex2ch3v2():
	data_array = parseFile()

	bla_scores = ""
	cru_scores = ""

	index = 0
	for data_obj in data_array:
		if str(data_array[index].program) == "BLA":
			bla_scores = bla_scores + data_array[index].total + ","
		elif str(data_array[index].program) == "CRU":
			cru_scores = cru_scores + data_array[index].total + ","

		index += 1

	print("CRU: " + cru_scores)
	print("BLA: " + bla_scores)


# M1 The probability that a student gets question 1-4 right is 50%
def ex2dm1():
	data_array = parseFile()

	all_four_right_counter = 0
	other_counter = 0

	index = 0
	for data_obj in data_array:
		if int(data_array[index].q1) == 1 and int(data_array[index].q2) == 1 and int(data_array[index].q3) == 1 and int(data_array[index].q4) == 1:
			all_four_right_counter += 1
		else:
			other_counter += 1

		index += 1

	print("all four correct: " + str(all_four_right_counter))
	print("others: " + str(other_counter))

	# Plotting
	objects = ("All four correct", "One or more wrong")
	y_pos = np.arange(len(objects))
	performance = [all_four_right_counter, other_counter]

	plt.bar(y_pos, performance)
	plt.xticks(y_pos, objects)
	plt.ylabel("Number of students")
	plt.title("Results of question 1-4 combined")

	plt.show()


# M2 The average score of question 5-8 is more than 15 points
def ex2dm2():
	data_array = parseFile()

	combined_average = 0
	average_scores_string = ""

	index = 0
	for data_obj in data_array:

		question_average = (int(data_array[index].q5) + int(data_array[index].q6) + int(data_array[index].q7) + int(data_array[index].q8)) / 4
		average_scores_string += str(question_average) + ","
		combined_average += question_average
		index += 1

	result = combined_average / index

	print("Average: " + str(result))
	print("STring: " + average_scores_string)


# M3 The average score of question 5 and 6 is higher than the average score of question 7 and 8
def ex2dm3():
	data_array = parseFile()

	combined_average_five_and_six = 0
	combined_average_seven_and_eight = 0
	average_scores_string_five_and_six = ""
	average_scores_string_seven_and_eight = ""

	index = 0
	for data_obj in data_array:
		question_average_first = (int(data_array[index].q5) + int(data_array[index].q6)) / 2
		question_average_second = (int(data_array[index].q7) + int(data_array[index].q8)) / 2
		average_scores_string_five_and_six += str(question_average_first) + ","
		average_scores_string_seven_and_eight += str(question_average_second) + ","
		combined_average_five_and_six += question_average_first
		combined_average_seven_and_eight += question_average_second
		index += 1

	result_first = combined_average_five_and_six / index
	result_second = combined_average_seven_and_eight / index

	print("Average first: " + str(result_first))
	print("Average second: " + str(result_second))
	print("String first:: " + average_scores_string_five_and_six)
	print("String second:: " + average_scores_string_seven_and_eight)


# M4 Given 100 students from each program which has the highest total score, CRU will have the highest average score.
def ex3dm4():
	data_array = parseFile()

	all_cru_totals = []
	all_bla_totals = []

	index = 0
	for data_obj in data_array:
		if str(data_array[index].program) == "BLA":
			all_bla_totals.append(data_array[index].total)
		elif str(data_array[index].program) == "CRU":
			all_cru_totals.append(data_array[index].total)

		index += 1

	all_cru_totals.sort()
	all_bla_totals.sort()

	top_100_cru_totals = all_cru_totals[:100]
	top_100_bla_totals = all_bla_totals[:100]

	print("CRU: " + str(top_100_cru_totals))
	print("BLA: " + str(top_100_bla_totals))

	top_100_cru_average = 0
	top_100_bla_average = 0

	for elem in top_100_cru_totals:
		top_100_cru_average += int(elem)

	top_100_cru_average = top_100_cru_average / 100

	for elem in top_100_bla_totals:
		top_100_bla_average += int(elem)

	top_100_bla_average = top_100_bla_average / 100


	print("CRU top 100 avg: " + str(top_100_cru_average))
	print("BLA top 100 avg: " + str(top_100_bla_average))


def parseFile():
	file = open("vitdata.txt", "r")
	lines = file.readlines()
	line_count = 0
	parsed_objects_array = []
	for line in lines:
		if line_count != 0:
			parsed_objects_array.append(parse_line(line))
		line_count += 1

	#print(str(len(parsed_objects_array)))

	return parsed_objects_array


def parse_line(line):
	line_elems = line.split(",")
	data_object = DataObject()

	data_object.program = line_elems[0][1:4]
	data_object.gender = line_elems[1][1:2]
	data_object.q1 = line_elems[2]
	data_object.q2 = line_elems[3]
	data_object.q3 = line_elems[4]
	data_object.q4 = line_elems[5]
	data_object.q5 = line_elems[6]
	data_object.q6 = line_elems[7]
	data_object.q7 = line_elems[8]
	data_object.q8 = line_elems[9]
	data_object.total = line_elems[10]

	# remove trailing \n
	data_object.total = data_object.total.rstrip()

	#print(data_object.to_string_print())
	return data_object


# MAIN SECTION
ex3dm4()
