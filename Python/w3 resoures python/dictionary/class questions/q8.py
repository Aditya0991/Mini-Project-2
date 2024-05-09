dct1 = {1:10, 2:20} 
dct2 = {3:30, 4:40} 
dct1.update(dct2)
print(dct1)

# Method-2
for i in dct2:
    dct1[i] = dct2[i]
print(dct1)