color = ['Red', 'Green', 'White', 'Black', 'Pink', 'Yellow']
f = open('abc.txt', "w")
for c in color:
    f.write("%s\n" % c)

content = open('abc.txt')
print(content.read())
