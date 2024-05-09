#Q2. Write a Python program to read first n lines of a file.
f = open('first.txt','r')
n = int(input('Enter the number of lines you want to read  :'))
for i in range(0,n):
    print(f.readline())