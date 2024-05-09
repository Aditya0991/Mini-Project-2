st1 = input("Enter the string  1: ")
s1 = st1.split()
st2 = input("Enter the string 2 : ")
st3 = ''
for i in s1:
    if st2 in i:
        del(st2(st2.index(i)))

print(st2)