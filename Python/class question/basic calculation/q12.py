side1=int(input("enter the first side of triangle:"))
side2=int(input("enter the second side of triangle:"))
side3=int(input("enter the third side of triangle:"))
if(side1==side2==side3):
    print("Triangle is equilateral")
elif((side1==side2) or (side2==side3) or (side3==side1)):
    print("Triangle is isosceles")
else:
    print("Triangle is scaleten")