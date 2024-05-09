import random
count = 0

ran = random.randrange(1,100)
print(ran)
for i in range(100):
    num = int(input("Enter the number :"))
    if num>ran:
        print("Enter the smaller number")
    elif num<ran:
        print("Enter the greater number ")
    elif num == ran:
        print("Congratulation! You guess the correct number")
        break
    count+=1
print(f'No of attempts {count}')