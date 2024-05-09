#Q5 - Python program to print even length words in a string.
st=input("Enter the string: ")
count=0
s=st.split()

for i in range(0,len(s)):
   
    if len(s[i])%2==0:
        print(s[i],end='\t')
