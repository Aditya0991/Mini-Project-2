num1=int(input("Enter the number 1 "))
num2=int(input("Enter the number 2 "))
sum=num1+num2
if sum>=15 and sum<=20:
    sum=20
    print("when sum is between 15 and 20 then ",sum)
else:
    sum=num1+num2
    print('sum of num1 and num2 is ',sum)