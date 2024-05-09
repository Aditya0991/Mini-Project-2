def prime(n):
    c = 0
    for i in range(1, n+1):
        if n%i == 0:
            c += 1
    if c != 2:
        return n
    else:
        return False
n = list(map(int, input().split(',')))
d = []
for i in n:
    if prime(i):
        d.append(i)
print(d)
