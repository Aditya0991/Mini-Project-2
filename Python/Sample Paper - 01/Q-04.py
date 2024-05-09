def solve(n):
    c = 50
    h = 30
    q = ((2*c*n)/h) ** .5
    return q
a = list(map(int, input().split(',')))
d = []
for i in a:
    b = int(solve(i))
    b = str(b)
    d.append(b)
print(','.join(d))
