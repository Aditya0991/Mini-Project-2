str1=input("Enter string First: ")
str2=input("Enter string second: ")
f_str=str1[:2]
s_str=str2[:2]
one=str1.replace(f_str,s_str)
two=str2.replace(s_str,f_str)
print(one)
print('\n'+two)