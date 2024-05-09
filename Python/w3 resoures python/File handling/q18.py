f =open('first.txt','r')
count = 0
for line in f:
    words = line.split(' ')
    count += len(words)
f.close()
print('no of words in text file : ', count)


