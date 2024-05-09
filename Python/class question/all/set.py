st = ['one' , 'two' ,'three']


dct ={}
for i in st:
    dct.setdefault(i,'a')
    
print(dct)
