amt=int(input("enter the amount:"))
amt=amt-100
n2=amt//2000
lefamt=amt%2000
n5=lefamt//500
lefamt=amt%500
n1=lefamt//100
print(f'number of 2000 notes {n2} ,500 notes {n5} and 100 notes {n1+1}')