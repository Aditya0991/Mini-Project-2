num1=int(input("enter number first:"))
num2=int(input("enter number second:"))
opr=input("enter the oprator which you want to perform(+,-,*,/,%):")
print(type(opr))
if opr== '+':
    print("sum:",num1+num2)
elif opr== '-':
    print("substraction:",num1-num2)
elif opr=='*':
    print("multiplication:",num1*num2)
elif opr=='/':
    print("division:",num1/num2)
elif opr=='%':
    print("remainder:",num1%num2)
else:
    print("Invalid")