n = int(input())
l = len(str(n))
s = n
d = 0
while(n>0):
    i = n%10
    d += i**l
    n = n//10
if s == d:
    print("Armstrong")
else:
    print("Not Armstrong")
    
    
