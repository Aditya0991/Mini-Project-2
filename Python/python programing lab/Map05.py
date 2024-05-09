#Q5.Write a Python program to add two given lists and find the difference between lists. Use map() function.

lst1 = [1,2,3,4,5]
lst2 = [0,9,8,7,6]
sum_lst = list(map(lambda x,y : x+y , lst1,lst2))
print(sum_lst)
print("Differnce between sum list and list1 - ")
dif = list(map(lambda x,y:x-y,sum_lst,lst1))
print(dif)