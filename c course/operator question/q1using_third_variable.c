#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter value of a and b");
    scanf("%d %d",&a,&b);
    c=(a>b)?a:b;
    printf("greatest amounst two:%d",c);
    return 0;
}