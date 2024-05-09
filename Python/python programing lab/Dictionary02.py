#Q2. Write a Python program to remove a key from a dictionary.  
dct = {'data1' : 10 , 'data2' : 2 ,'data3' : 9}
k = (input("Enter the key you want to remove:"))
dct.pop(k)
print(dct)