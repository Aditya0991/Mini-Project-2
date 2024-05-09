#Q1 Duplicate charaters of string
def DUPLICATE():
    s=s1=input("Enter String : ")
    for i in set(s):
        if(s1.count(i)>1):
            print(i)
DUPLICATE()
    

#Q2 Average steps
total=2052
n=int(input("Days : "))
print("Average : ", total/(n*2))


#Q3 create separate files
fp=open('file1.txt','r')
file=fp.read()
alpha=num=''
for i in file:
    if(i.isalpha()):
        alpha+=i
    elif(i.isdigit()):
        num+=i
fp1=open('file2.txt','w')
file=fp1.write(alpha)

fp2=open('file3.txt','w')
file=fp2.write(num)

fp.close()
fp1.close()
fp2.close()
