dct = {3 : 30,10 : 1,  7 : 40} 

s_dct = {key:value for key,value in sorted(dct.items(),key = lambda x:x[1])}
print(s_dct)
