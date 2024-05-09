lst1 = [1,2,3]
lst2 = [4,5,6]
lst3 = [7,8,9]
out_lst = list(map(lambda x,y,z:x+y+z , lst1,lst2,lst3))
print(out_lst)