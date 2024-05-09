#Q1 WAP to calculate people travelling
day=275000
period=int(input("Enter time(Months): "))
year=(275000*12)+15/100*(275000)*period
print("Train system carry ",year,"people each year")


#Q2 WAP to create dictionary of alphabets and ascii value
import string
ASC_Value={i:ord(i) for i in string.ascii_lowercase}
print(ASC_Value)
name=input("Enter Name : ").lower()
a_score=0
for i in range(len(name)):
    a_score+=int(ASC_Value[name[i]])
print("ASCII Score : ",a_score)


#Q3 WAP read content of file and count word,alphabets,lines and digits
fp=open("DATA.txt",'r')
file=fp.read()
word=file.split()
word=len(word)
alpha=digit=0
for i in file:
    if(i.isalpha()):
        alpha+=1
    elif(i.isdigit()):
        digit+=1
        
fp=open("DATA.txt",'r')
line=fp.readlines()
line=len(line)
print('Alphabets : ',alpha,"Word : ", word, "Digit : ",digit, "Lines : ",line)
fp.close()
