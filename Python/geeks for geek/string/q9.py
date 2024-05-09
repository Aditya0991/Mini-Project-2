import string
st=input("Enter the string: ")
alp=0
num=0

for i in st:
    if i in string.ascii_lowercase:
        alp+=1
    elif int(i) in range(0,10):
        num+=1
    
if alp>0 and num>0:
    print('string has atleast one character and number')
else:
    print('not ')
print(f'alphabets {alp} and number {num}')
