st = input("Enter the string : ")
s = ''
for i in st :
    if i not in s:
        s+=i
        print(i,':',st.count(i),end = '\t')
        