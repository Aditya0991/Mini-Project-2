#Q3. Write a Python program to multiply all the items in a dictionary
dct = {'data1' : 10 , 'data2' : 2 ,'data3' : 9}
v = dct.values()
mul = 1
print(v)
for i in v:
    mul = mul*i
print(mul)