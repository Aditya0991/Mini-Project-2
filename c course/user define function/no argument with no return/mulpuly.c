#include<stdio.h>
float mul()
{
    float a,b,c;
    printf("enter the value of a and b:");
    scanf("%f %f",&a,&b);
    c=a*b;
    printf("multiplication of a and b:%f",c);
    return c;
}
int main()
{
    mul();
    return 0;
}