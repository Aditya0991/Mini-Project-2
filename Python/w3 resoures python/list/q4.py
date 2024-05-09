list=[87,43,67,32]
sml=list[0]
for i in range(0,len(list)):
    if(sml>list[i]):
        sml=list[i]
print("smallest element of list:",sml)
