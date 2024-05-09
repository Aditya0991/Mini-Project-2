#Q4 - Python program to capitalize 
# the first and last character of each word in a string.
st = input("Enter the string : ")
st = st.title()
s = st.split()
string = ''
for i in s:
    string+=i[:-1] + i[-1].upper() + ' '

print(string)