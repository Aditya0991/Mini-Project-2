from cmath import sqrt


center_x=int(input("enter the x co-ordinate of center of circle: "))
center_y=int(input("enter the y co-ordinate of center of circle: "))
radius=int(input("enter the radius of circle: "))


p_x=int(input("enter the x co-ordinate of point p:"))
p_y=int(input("enter the y co-ordinate of point p:"))

dis=pow((pow(p_x - center_x,2)+pow(p_y - center_y,2)),0.5)

if(dis>radius):
    print("Point is outside the circle")
elif(dis<radius):
    print("Point is inside the circle")
elif(dis==radius):
    print("Point is at the boundary of circle")
