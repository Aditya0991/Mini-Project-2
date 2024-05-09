#DISCOUNT CALCULATOR
amt=int(input('enter the bill amount: '))
if(amt>25000):
    print("Congratulations! You are our Gold Member you will get 20per diccount")
    dis=20*amt/100
elif(amt>=10000 and amt<=25000):
    print("Congratulations! You are our silver Member you will get 10per diccount")
    dis=10*amt/100
else:
    print("Congratulation! You are eligible for 5 per discount")
    dis=5*amt/100
net_amt= amt-dis
print(f"Your net amount is {net_amt}")