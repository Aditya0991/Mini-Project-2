l = list(map(int, input().split(',')))
d = []
c = 0
for i in l:
    if i == False:
        c += 1
    elif i !=0:
        d.append(i)
for j in range(1, c+1):
    d.append('0')
print(d)
