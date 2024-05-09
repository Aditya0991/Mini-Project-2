print("Enter the First points: ")
a = eval(input("Enter x1: "))
b = eval(input("Enter y1: "))
print("Enter the Second points: ")
c = eval(input("Enter x2: "))
d = eval(input("Enter y2: "))

x = ((a - c) ** 2)
y = ((b - d)** 2)

z =(x + y)** .5
print("The distance between two point is: ", z)
