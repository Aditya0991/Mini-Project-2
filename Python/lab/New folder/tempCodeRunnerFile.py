# fp=open('info.txt','w')
# n=int(input("Enter N: "))
# n1=int(input("Enter random range : "))
# import random
# s=''
# for i in range(n):
#     s+=str(random.randint(0,n1))+'\n'
# fp.write(s)
# fp.close()

# fp=open('info.txt','r')
# file=fp.readlines()
# Sum=0
# for i in file:
#     Sum+=int(i)
# print(Sum/n)
# fp.close()




f = open('info.txt','w')
lst =['fdfg','adg','fd']
f.writelines(lst)
f.close()