list=['abc','xyz','aba','121','klm']
count=0
for i in list:
    if len(i)>1 and i[0]==i[-1]:
        count+=1
print(count)