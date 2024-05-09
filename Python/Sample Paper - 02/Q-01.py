n = input().split()
c = len(n)
for i in range(0, c):
    if n[i].isnumeric():
        print("Yes")
        break
    else:
        print("No")
        #break
    
else:
    print("Empty")
