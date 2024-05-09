n = int(input('enter the line from which you wnat to read : '))
f = open('num.txt','r')

for line in f.readlines()[-n::]:
    print(line, end = ' ')