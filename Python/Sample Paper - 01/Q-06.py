n = input().upper()
d = input().upper()
c = 0
for i in range(len(n)-len(d)+1):
    if (n[i:i+len(d)] == d):
        c += 1
print(c)
