String1 = input('Enter the String :')
#initialize empty String
String2 = ''
for i in String1:
    #check for alphabets
    if i not in ((ord(i) >= 65 and ord(i) <= 90)\
         or (ord(i) >= 97 and ord(i) <= 122)):
        #concatenate to empty string
        String2+=i
print('Alphabets in string are :' + String2)