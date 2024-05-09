import numpy as np
lst = map(int,input().split())
a = []
for i in range(0,r):
    b = list(map(int,input().split()))
    a.append(b)
arr = np.array(a,ndmin = 3)

print(arr.T)
print(arr.flatten())

