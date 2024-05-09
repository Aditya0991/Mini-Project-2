n = int(input("Enter the number of element: "))
l = []
c = 0
for i in range(1, n+1):
    t = int(input("Enter the element"))
    for j in range(1, t+1):
        if t%j == 0:
            c += 1
    if c != 2:
        l.append(t)
print(l)
