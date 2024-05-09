dct = {1 : 'One', 2 : 'Two ' , 3 : 'Three' , 4 : 'Four'}
for i in dct:
    print(i ,'-->' , dct[i])

print(dct.items())
# Method 2 :-using two variable in for loop
for d_k , d_v in dct.items():
    print(d_k ,'-->',d_v)