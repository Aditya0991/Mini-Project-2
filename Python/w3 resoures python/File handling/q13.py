f1 = open('sample01.txt','r')
f2 = open('pqr.txt','a')
for i in f1:
    f2.write(i)

