#include<stdio.h>
float vol()
{
    float pi=3.14,rad,vol;
    printf("enter the radius:");
    scanf("%f",&rad);
    vol=1.33*pi*rad*rad*rad;
    printf("volume of sphere:%f",vol);
}
int main()
{
    vol();
    return 0;
}