#Q4 - Count occurance of an element in a list

lst=[0,1,6,3,4,5,6,6]
count=0
ele = int(input())
for i in lst:
    if i==ele:
        count+=1
print(f'Total ocurance of {ele} in given list is {count}')