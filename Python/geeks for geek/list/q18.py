lst=[1,10,2,23,3,4,5,34,6,7,8,9,87]
lst1=[]
for i in lst:
    if i%2==0:
        lst1.append(i)
lst1.sort()
print(lst1)

