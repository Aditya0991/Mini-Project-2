rows = 5
count =65
for i in range(1,rows+1):
    for j in range(i):
        print(chr(count),end = '')
        count+=1
    print()