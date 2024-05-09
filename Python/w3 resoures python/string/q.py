for i in range(3,20,2):
    print(i)
    na=input("Enter the string: ")
n=na.split()

largest=len(n[0])
for i in n:
    if len(i)>largest:
        largest=len(i)
        word=n(i)

print("largest string of length: " ,largest )

# word=n[1]