n = list(map(int, input().split(',')))
d = []
mi = min(n)
ma = max(n)
a = int(n[-1])
for i in range(mi, 101):
    if i not in n:
        d.append(i)
print(d)
     
