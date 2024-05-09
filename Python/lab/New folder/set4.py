#Q1 Wap to accept comma-separated sequence and to print it after sorting alphabetically
seq=list(input().split(','))
l=len(seq)
for i in range(l):
    for j in range(l-1):
        if(seq[j+1]<seq[j]):
            seq[j+1],seq[j]=seq[j],seq[j+1]
seq=','.join(seq)
print(seq)

#or
seq=','.join(sorted(list(input().split(','))))
print(seq)


#Q2 Wap to count uppercase and lowercase characters
def COUNT_CASE():
    fp=open('data.txt','r')
    file=fp.read()
    up=low=0
    for i in file:
        if(i.isupper()):
            up+=1
        elif(i.islower()):
            low+=1
    print("No. of Upper case characters: ",up,"No. of Lower case Characters: ",low,end=' ')
    fp.close()

#Q3  WAP to create dictionary of names and marks
data={input("Name : "):int(input("Marks : ")) for i in range(10)}
Sum=0
for i in data:
    print(i,data[i])
    Sum+=data[i]
print("Average : ",Sum/10)

    
