#include<stdio.h>
float mul()
{
    float a,b,c;
    printf("enter the value of a and b:");
    scanf("%f %f",&a,&b);
    c=a*b;
    return c;
}
int main()
{
    printf("%f",mul());
    return 0;
}