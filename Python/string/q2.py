st = input("Enter the string :")
vow=cons=num=space=0
for ch in st:
    if ch in 'aeiou':
        vow+=1
    elif ch=='0'or ch=='1'or ch=='2'or ch=='3'or ch=='4'or ch=='5'\
        or ch=='6'or ch=='7'or ch=='8'or ch=='9':
        num+=1
    elif ch in ' \n\t':
        space+=1
    else:
        cons+=1
print('vowel: ',vow,'num: ',num,'space: ',space,'consonent: ',cons)
