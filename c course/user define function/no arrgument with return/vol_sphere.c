#include<stdio.h>
float vol()
{
    float radius,pi=3.14,v;
    printf("enter the radius:");
    scanf("%f",&radius);
    v=1.33*pi*radius*radius*radius;
}
int main()
{
    float vol1=vol();
    printf("volume of sphere:%f",vol1);
    return 0;
}