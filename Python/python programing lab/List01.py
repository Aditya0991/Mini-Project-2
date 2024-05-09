# Q1 - Find second largest element in list.

lst=[5,3,1,8,0,10,15,2,90]
lar=lst[0]
s_lar=lst[0]
for i in range(len(lst)):
    if lar<lst[i]:
        lar=lst[i]
    
for i in range(len(lst)):
    if lar!=lst[i] and s_lar<lst[i]:
        s_lar=lst[i]

print(s_lar)