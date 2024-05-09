st = input("Enter the string: ")
s = st.split()
max = s[0]
min = s[0]
for i in range(0,len(s)):
    if len(max)<len(s[i]):
        max = s[i]
        

    if len(min) >len(s[i]):
        min = s[i]

print('max: ',  max , len(max))
print('min: ', min , len(min))
