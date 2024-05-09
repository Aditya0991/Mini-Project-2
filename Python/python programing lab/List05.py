#Q5 - Python Program to find sum and average of List in Python.
lst=[1,2,3,4,5]
sum=0
l=len(lst)
for i in lst:
    sum+=i
    avg=sum/l
print('sum: ',sum,'average: ',avg)