#include<stdio.h>
int area()
{
    int side,a;
    printf("enter the length of side:");
    scanf("%d",&side);
    a=side*side;
    return a;
}
int main()
{
    printf("%d",area());
    return 0;
}