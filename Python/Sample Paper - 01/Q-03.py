def fact(n):
    d = 1
    for i in range(1,  n+1):
        d = d*i
    return d

l = list(map(int, input().split(',')))
d = []
for i in l:
    q = fact(i)
    q = str(q)
    d.append(q)
print(','.join(d))
