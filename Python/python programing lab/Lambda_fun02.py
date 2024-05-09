'''Q2- Write a Python program to square and cube every number
 in a given list of integers using Lambda.'''
lst = [1,2,3,4,5,6,7,8,9,10]
b = list(map(lambda x:x**2,lst))
print(b)