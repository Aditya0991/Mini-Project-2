num=int(input("enter the number: "))
i=1
fact=0
print("It's factors are ",end='')
while i<=num:
    if(num%i==0):
        print(i,end=' ')
        fact=fact+1
    i=i+1
if(fact==2):
    print(num)
    
    print("Number is a prime number")
else:
    print("Number is not a prime number")