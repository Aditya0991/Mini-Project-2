lst=[5,3,1,8,0,10,15,2,90]
large=lst[0]
sec_large=lst[0]
for i in range(len(lst)):
    if large<lst[i]:
        large=lst[i]
    
for i in range(len(lst)):
    if large!=lst[i] and sec_large<lst[i]:
        sec_large=lst[i]

print(sec_large)