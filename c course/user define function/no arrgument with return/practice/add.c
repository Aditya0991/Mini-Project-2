#include<stdio.h>
int sum()
{
    int a,b,c;
    printf("enter the number you want to add:");
    scanf("%d %d",&a,&b);
    c=a+b;
    return c;
}
int main()
{
    printf("sum:%d",sum());
    return 0;
}