print('please input two integers')
array = []
for i in range(0,2):
    while True:
        try:
            a = int(input('input a number: '))
        except:
            print('input a number !!!')
        else:
            array.append(a)
            break
while True:
    a = max(array)
    b = min(array)
    if a%b == 0:
        print('gcd: ')
        print(b)
        break
    else:
        array.pop()
        array.pop()
        array.append(a-b)
        array.append(b)

