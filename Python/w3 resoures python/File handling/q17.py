f =  open('first.txt','r+') 
line = f.readlines()
print(line)
[print(l.strip()) for l in line] 
