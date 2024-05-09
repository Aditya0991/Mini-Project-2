l=[13,2,6,0,5,5,13,5]
count_13=0
count_5=0
for i in l:
    if i==13:
        count_13+=1
    elif i==5:
        count_5+=1
if count_13>=2 and count_5>=3:
    print(True)
else:
    print(False)