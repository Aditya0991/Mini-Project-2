n = int(input("Enter the no. of students: "))
C = int(input("Enter total candies availabe: "))
print("The no. of candies want by: ")
s = 0
for i in range(1, n+1):
     print(i, ": ", end=' ')
     a = int(input())
     s = s + a
if s<=C:
    print("Yes")
else:
    print("Not")
     
