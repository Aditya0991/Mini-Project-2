str=input("Enter the string:")
l=len(str)
if(l>2):
    if(str[-3:]=='ing'):
        add=str.replace(str[-3:],'ly')
    else:
        add=str+"ing"
    print(add)
else:
    print(str)