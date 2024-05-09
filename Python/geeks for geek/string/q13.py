s = input("Enter the string : ")
n_s = ''
for i in s:
    if i not in n_s:
        n_s+=i
print(n_s)