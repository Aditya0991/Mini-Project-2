#Q3.Write a Python program to create a list containing the power of said number in bases raised to the corresponding number in the index using Python map.

lst = [10 , 20 , 30]
inx = [1 , 2 , 3]
out = list(map(pow,lst,inx))
print(out)