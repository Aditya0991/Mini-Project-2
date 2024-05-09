#include<stdio.h>
float trap()
{
    float a,b,h,area;
    printf("enter the parrale side a and b: ");
    scanf("%f %f",&a,&b);
    printf("enter the height:");
    scanf("%f",&h);
    area=0.5*(a+b)*h;
    printf("area of trapezium:%f",area);
}
int main()
{
    trap();
    return 0;
}