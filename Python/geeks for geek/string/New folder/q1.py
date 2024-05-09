st = input("Enter the string : ")
st1 = st[::-1]
print(st1)

#Method -2
rev =''.join(reversed(st))
print(rev)
#method - 3
st3 = ''
for i in range(len(st)-1,0,-1):
    st3 +=st1[i]
print(st3)
