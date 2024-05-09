f = open('num.txt','r')
lst = f.readlines()
print(lst)
max_len = -1
for ele in lst:
    if len(ele) > max_len:
        max_len = len(ele)
        res = ele
print(res)
print()



