a = input().upper()
b = input().upper()
c = 0
for i in range(len(a)-len(b)+1):
    if (a[i:i+len(b)] == b):
        c+= 1
print(c)
