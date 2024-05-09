num=input("Enter the number: ")
sum=int(num[0])+int(num[-1]) if len(num)>1 else int(num)
print(sum)