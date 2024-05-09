lst=[1,3,4,5,9]
lst1=[]
for i in range(1,11):
    if i not in lst:
        print(i,end=', ')
        lst1[i]

print(lst1)
