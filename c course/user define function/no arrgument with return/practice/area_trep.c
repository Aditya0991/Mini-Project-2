#include<stdio.h>
int trep()
{
    int a,b,h,ar;
    printf("enter the value of a and b:");
    scanf("%d %d",&a,&b);
    ar=0.5*(a+b)*h;
    return ar;
}
int main()
{
    printf("area:%d",trep());
    return 0;
}