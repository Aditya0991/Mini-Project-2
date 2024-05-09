l = list(map(int, input().split(',')))
c = 50
h = 30
d = []
for i in l:
    q = int(((2*c*i)/h)**.5)
    q = str(q)
    d.append(q)

print(','.join(d))
    
