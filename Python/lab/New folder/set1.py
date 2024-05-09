#Q1 WAP to calculate space
T=int(input("Free Space(bytes) : "))
U=int(input("Used Space(bytes) : "))
O=int(input("Deleted Space(bytes) : "))
H=int(input("New File Space(bytes) : "))

print("Free Space(bytes) : ",T+O-H)
print("Used Space(bytes) : ",U-O+H)


#Q2 WAP to accepts hyphen-sep seq and prints in a hyp-sep seq after sorting alphabetically
seq=list(input().split('-'))
l=len(seq)
for i in range(l):
    for j in range(l-1):
        if(seq[j+1]<seq[j]):
            seq[j+1],seq[j]=seq[j],seq[j+1]
seq='-'.join(seq)
print(seq)


#Q3 WAP to create new file and write details
fp=open('mydata.txt','w')
name=input('Name : ')
phone=input("Phone no. : ")
roll=input("Roll no : ")
branch=input("Branch : ")
file=fp.write(name+' ' +phone+' '+roll+' '+branch)
fp.close()
