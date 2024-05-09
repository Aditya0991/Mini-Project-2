l = int(input("Length of Tile: "))
b = int(input("Breadth of Tile: "))
lf = int(input("Length of floor: "))
bf = int(input("Breadth of Floor: "))

if (l is b)
print("The tiles are square")
elif (lf is bf)
print("The floor is sqaure")

n = ( lf * bf ) / (l * b)
x = round (n, 0)
print ("Number of Tiles Required = ",x)
