num = int(input("Enter the number : "))

for i in range(1,num+1):
    dct = {i : i*i}
print(dct)


dct = {i:i**2 for i in range(1,num+1)}
print(dct)