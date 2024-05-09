n = input()
d = ''
for i in n:
    q = ord(i)
    if q >=65 and q <=90:
        a = chr(q+32)
        d += a
    elif q >=97 and q <=122:
        a = chr(q-32)
        d += a
print(d)
        
