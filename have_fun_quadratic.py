
import math

print('Please input your three parameters: ')
print('(no system to help to correct ~~)')

a = float(input('First: '))
b = float(input('Second: '))
c = float(input('Third: '))

delta = b*b - 4*a*c

nums = [a, b, c]
paras = []

equa = ''
for i in range(0,3):
	if(nums[i] == 1):
		paras.append('')
	elif nums[i] == -1:
		paras.append('-')
	elif nums[i] < 0 and nums[i] != -1:
		paras.append('-' + str(nums[i]))
	elif nums[i] > 0 and nums[i] != 1:
		paras.append('' + str(nums[i]))
	else:
		paras.append('0')
	
for i in range(0, 3):
	if i == 0:
		equa = equa + paras[i] + "x^2";
	elif i == 1:
		if nums[i] == 0:
			pass
		else:
			equa = equa + '+' + paras[i] + "x";
	elif i == 2:
		if nums[i] == 0:
			pass
		else: 
			equa = equa + '+' + paras[2];

equa = equa + " =0"
print('Your assigned equation is : ')
print(equa)
root1 = (-1 * b - math.sqrt(delta))/(2 * a)
root2 = -1 * b + math.sqrt(delta)/ ( 2 * a)
print('Roots: ')
print(root1)
print(root2)

	
		
	
