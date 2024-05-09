st = input("Enter the string : ")
num=0
space=0
vowel=0
other=0
for ch in st:
    if ch>='0' and ch<='9':
        num+=1
    elif ch==' ' or ch=='\t' or ch=='\n':
        space+=1
    elif ch in 'aeious':
        vowel+=1
    else:
        other+=1

print('number : ',num,'space: ',space,'vowel: ',vowel, 'consonent: ',other)