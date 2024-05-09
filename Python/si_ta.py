print ("Enter the details ")
p = int(input("Principal amount: "))
r = int(input("Rate of interest per month: "))
t = int(input("Time period in months: "))

si = p * r * t / 100
ta = si + p

print("The Simple Interest Formed = ", si)
print("Total Amount is = ", ta)
