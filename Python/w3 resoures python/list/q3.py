list=[2,9,22,5,6]
lar=list[0]
for i in range(0,len(list)):
    if(list[i]>lar):
        lar=list[i]
print("largest element of list: ",lar)
