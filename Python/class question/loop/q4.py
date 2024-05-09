num=100
sum=0
while num<1000:
    orig=num
    a=num
    while a>0:
        r=a%10
        cube=r*r*r
        sum=sum+cube
        a=a//10

if(orig==sum):
    print(orig,end=" ")
num=num+1
