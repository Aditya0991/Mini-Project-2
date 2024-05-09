#include<stdio.h>
int main()
{
    int a,b,c,d;
    printf("enter the value of a,b,c:");
    scanf("%d %d %d",&a,&b,&c);
    d=(a>b)?a:b;
    d=(d>c)?d:c;
    printf("greatest amoung three:%d",d);
    return 0;
}