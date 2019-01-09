
def poly_cal(y, items):
	'''
	Function to calculate the value of a polynoimial at the given value
	'''
	result = 0;
	for item in items:
		result += item['cfft'] * pow(y, items['pwr'])
	return result


def get_power(item):
	'''
	Function to obtain the power of the item
	'''
	if '^' in item:
		for i in range(0, len(item)):
			if item[i] == '^':
				break
		#return the part after the sign ^
		return int(item[i+1 :])
	else:
		try:
			int(item)
			return 0
		except:
			return 1


def get_cfft(item):
	'''
	Function to obtain the coefficient of the item
	'''
	ascii_chars = 'abcdefghijklmnopqrstuvwxyz'
	ascii_chars += 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
	try:
		return int(item)
	except:
		for i in range(0, len(item)):
			if item[i] in ascii_chars:
				break
		#return the part before the variable
		if i == 0:
			result = 1
		else:
			result = float(item[:i-1])
		
		return result
		
func = raw_input ('Please input your polynomial here')

#Split the items
func_tmp = func.replace('+', '*')
func_tmp = func_tmp.replace('-', '*')
func_tmp = func_tmp.split('*')

items = []
#Operate on each item
for item in func_tmp:
	#create a dict to store the coefficient and the power
	item_tmp = {}
	
	#Obtain the power as well as the coefficient
	power = get_power(item.strip())
	cfft = get_cfft(item.strip())
	
	item_tmp['cfft'] = cfft
	item_tmp['pwr'] = power
	
	#Store the data into the items
	items.append(item_tmp)

#Correct the sign of each item
	
index = 0   #the index to change the sign of the specific item
for char in func:
	if char == '+':
		index += 1
	elif char == '-':
		items[index]['cfft'] *= -1
		index += 1

#Operate on the interval
print('Input an interval [a, b] that f(a) * f(b) < 0')
interval = raw_input('Input your interval here: ')

interval = str(interval[1:-1])
print(interval)
inteval = interval.split(',')


a = float(interval[0])
b = float(interval[1])


precision = raw_input('What is your intend precision? ')
while True:
	left = poly_cal(a, items)
	right = poly_cal(b, items)
	middle = poly_cal( (a + b)/2, items)
	if abs(middle) < precision:
		break
	elif middle *  right > 0:
		b = (a + b)/2;
	else:
		a = (a + b)/2;
		
print('The zero is around ' + str((a+b)/2))
		



