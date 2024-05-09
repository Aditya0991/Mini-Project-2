st=input("Enter the string : ")
rev=''.join(reversed(st))
if st==rev:
    print("string is palindrom")
else:
    print("string is not palindrom")