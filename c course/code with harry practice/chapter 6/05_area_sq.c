#include<stdio.h>
int area(int side);

int main()
{
    int side;
    printf("enter the side:");
    scanf("%d",&side);
    area(side);

    return 0;
}
int area(int side)
{
    int area;
    
    area=side*side;
    printf("area of square:%d",area);
    return area;
}