n = tuple(map(int, input().split(',')))
q = tuple(map(int, input().split(',')))
a = []
for i in n:
    a.append(i)
for j in q:
    if j not in a:
        a.append(j)
print(tuple(a))
