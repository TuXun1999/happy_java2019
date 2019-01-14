import math



def char_input():
    first_name = raw_input("First name: ")
    last_name = raw_input("Last name: ")
    while True:
        try:
            birth = int(raw_input("Birth year: "))
        except:
            print("Input a year!!!")
        else:
            break
    year = birth + 100
    print("Hello, " + first_name + " " + last_name)
    print("You will be 100 years old at the year of " + str(year))
    
   
def divide():
    num = int(raw_input("a: "))
    div = int(raw_input("b: "))
    if (num%div == 0):
        print("a can be divided by b")
    else:
        print("a can't be divided by b")
        
def num_ls():
    a = int(raw_input("Input your number here: "))
    sample = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
    
    result = []
    for item in sample:
        if item <= a:
            result.append(item)
	'''
	A very awesome way :  (well, it is awesome because I forget it easily...)
	result = [b for b in sample if b < a ]
	'''
    print(result)


def divisor():
	num = int(raw_input("Input your integer here (larger than 1): "))
	divisors = []
	for i in range(1, num-1):
		if num%i == 0:
			divisors.append(i)
	print(divisors)
	
def tower():
	rows = 10
	numbers = []
	for i in range(1, rows+1):
		row = []
		for j in range(0, i):
			if j == 0 or j == i-1:
				row.append(1)
			else:
				row.append(numbers[i-2][j-1] + numbers[i-2][j])
		numbers.append(row)
	
	string = ''
	for i in range(1, rows+1):
		index = 0
		for j in range(1, 4*rows - 2):
			if j%2 == 0:
				string += "\t"
			else:
				tmp = (j+1)/2
				if tmp < rows - i + 1 or tmp > rows + i -1:
					string += "\t"
					if tmp == 2 * rows - 1:
						string += "\n"
				elif (tmp - (rows - i + 1))%2 ==0:
					string += str(numbers[i-1][index])
					index += 1
				elif (tmp - (rows - i + 1))%2 ==1:
					string += "\t"			
	print(string)
	print("Done")


def list_overlap():
	'''
	for i in range(0, 20):
		a.append(int(,math.random()*100)
		b.append(int(math.random()*100)
	'''
	a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
	b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]  
	
	overlap = [item for item in a if (item in b)]
	print(overlap)
		
def palindrome():
	sample = raw_input("Your string here: ")
	test = True
	for i in range(0, len(sample)/2):
		if sample[i] != sample[len(sample) - 1 - i]:
			test = False
			break
	if test:
		print("The string is palindrome")
	else:
		print("NO, it is not a palindrome")


def list_even(test):
	even = [a for a in test if a%2 ==  0]
	print(even)
	
			
choice = int(raw_input("Which exercise do you want to see?"))

if (choice == 1):
    char_input()

elif (choice == 2):
    divide()

elif (choice == 3):
    num_ls()
    
elif (choice == 4):
	divisor()
elif choice == 5:
	list_overlap()
elif (choice == 6):
	palindrome()
elif choice == 7:
	test = [pow(i, 2) for i in range(1, 11)]
	list_even(test)
elif (choice == 37):
	tower()



