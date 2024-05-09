#Q3. Write a Python program to append text to a file and display the text.
f = open('first.txt','a')
f.write('\nHave a Good day')
f.close()
print(f.closed)