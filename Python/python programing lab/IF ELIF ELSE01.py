num1=int(input("Enter number 1: "))
num2=int(input("enter number 2: "))
num3=int(input("enter number 3: "))
if(num1>num2 and num1>num3):
    print("number 1 is greatest")
elif(num2>num3 and num2>num1):
    print("number 2 is greatest")
else:
    print("number 3 is greatest")