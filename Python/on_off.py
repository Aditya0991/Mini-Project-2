l = 1
for k in range(1, 501):
    for i in range(1, 51):    
            if k%i==0:
                if l==1:
                    l=0
                elif l==0:
                    l=1
    if l==0:
        print("Student ", k, "has his phone off")
            
