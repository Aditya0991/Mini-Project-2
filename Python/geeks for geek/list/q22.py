
lst=[1,2,3,4,5,6,7,8,9,10,11]
count_even,count_odd=0,0

for i in lst:
    if i%2==0:
        count_even+=1
    elif i%2==1:
        count_odd+=1

print("Total even number in the list : ",count_even)
print("Total odd number in the list : ",count_odd)
