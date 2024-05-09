from dataclasses import replace


str=input("Enter the string: ")
first=str[0]
r=str.replace(first,'$')
print(first+r[1:])