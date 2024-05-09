num=int(input("Enter the number: "))
l = num%10
num//=10

while num > 9:
    num //=10

sum = l + num
print(sum)
