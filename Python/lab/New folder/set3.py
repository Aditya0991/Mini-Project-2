# Q1 WAP to calculate total cost
shirt=int(input("Enter number of shirts purchased : "))
game=int(input("Enter number of game purchased : "))
bracelets=int(input("Enter number of bracelets purchased : "))
total=(shirt*680)+(game*750)+(bracelets*230)

shirt1=int(input("Enter number of shirts returned : "))
bracelets1=int(input("Enter number of bracelets returned : "))
total=total-(shirt1*340)-(bracelets1*230)
print("Total cost : ",total)


#Q2 WAP to create file witn new line separated n number and than print average
fp=open('info.txt','w')
n=int(input("Enter N: "))
n1=int(input("Enter random range : "))
import random
s=''
for i in range(n):
    s+=str(random.randint(0,n1))+'\n'
fp.write(s)
fp.close()

fp=open('info.txt','r')
file=fp.readlines()
Sum=0
for i in file:
    Sum+=int(i)
print(Sum/n)
fp.close()


#Q3 WAP to return right rotated string
s=input("Enter string : ")
rotate=int(input("Enter rotation : "))
def right2(s,rotate):
    first=s[len(s)-rotate:]
    last=s[:len(s)-rotate]
    print("Rotated string : ",first+last)
right2(s,rotate)
































