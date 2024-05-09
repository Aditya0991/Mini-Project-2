from opcode import opname


f = open('info.txt','r')
info = f.read()

f = open('mydata.txt','r')
mydata = f.read()

f=open('info.txt','w')
f.write(mydata)
f.close()

f=open('mydata.txt','w')
f.write(info)
f.close()