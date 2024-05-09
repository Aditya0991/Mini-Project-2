n = int(input("Shopping Amount? "))
if n>=25000:
    d = 20
elif n<25000 and n>=10000:
    d = 10
else:
    d = 5

ta = n
- (n * d / 100)
print("The Amount to be paid is: ", ta)
