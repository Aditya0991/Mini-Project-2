s = input("Enter the string : ")
n_s = ''
for i in s:
    if i not in n_s:
        n_s+=i

min = n_s.count[n_s[0]]

for i in n_s:
    print(i, s.count(i),end =  '\t')
    if min > n_s.count(i):
        min = n_s[i]
print(min)
    
