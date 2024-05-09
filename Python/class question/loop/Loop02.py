num=int(input("Enter the number:"))
i=num
fact=1
while i>0:
    fact=fact*i
    i=i-1
print(f"factorial of entered number {fact}")