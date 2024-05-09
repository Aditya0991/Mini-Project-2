#Q1. Write a Python program to sort a given dictionary by key.  
dct = {10 : 1, 3 : 30, 7 : 40} 

s = sorted(dct.keys())
k_s =s.copy()
for i in range(0,len(k_s)):
    out = {}.fromkeys(s,k_s[i])
    
print(out)
