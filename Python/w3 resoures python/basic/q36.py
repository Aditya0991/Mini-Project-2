from unittest import installHandler


a=str(9)
b=3
if not(isinstance(a,int) and isinstance(b,int)):
    print("Enter the integer value")
else:
    sum=a+b
    print("sum of a and b is ",sum)