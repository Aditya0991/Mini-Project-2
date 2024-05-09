#Q5. Write a Python script to print a dictionary where the keys are numbers between 1 and 15 (both included) and the values are square of keys.  
num = int(input("Enter the number : "))
dct ={i : i*i for i in range(1,num+1)}
print(dct)

      
