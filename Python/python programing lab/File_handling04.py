#Q4. Write a Python program to read last n lines of a file.
n = int(input())
f = open('first.txt','r')
for i in f.readlines()[n-1::]:
    print(i,end = ' ')