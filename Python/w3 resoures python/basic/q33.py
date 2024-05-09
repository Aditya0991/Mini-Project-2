num1=int(input("Enter number 1 "))
num2=int(input("Enter number 2 "))
num3=int(input("Enter number 3 "))
if num1==num2 or num1==num3 or num2==num1 or num2==num3 or num3==num1 or num3==num2:
    sum=0
    print("when two numbers are equal ",sum)
else:
    sum=num1+num2+num3
    print("when all three number are different ",sum)