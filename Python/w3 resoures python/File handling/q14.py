f1 = open('first.txt','r')
f2 = open('second.txt','a')
for i in f1.readline():
    f2.write(i)
    