#Q1. Write a Python program to triple all numbers of a given list of integers. Use Python map.
lst = [1,2,3,4,5]

m = list(map(lambda x :x+x+x,lst))
print(m)    