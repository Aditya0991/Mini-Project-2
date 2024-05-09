#WAP TO PRINT UNIQUE CHARACTER OF STRING
st=input('Enter the string: ')
s = ''
for i in st:
    if st.count(i) == 1:
        s=s+i
print(s)
    

