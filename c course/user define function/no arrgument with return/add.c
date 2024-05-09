#include<stdio.h>
int sum()
{
    int a,b,c;
    printf("enter the value of a and b:");
    scanf("%d %d",&a,&b);
    c=a+b;
    return c;
}
int main()
{
    // int sum1;
    // sum1=sum();
    printf("sum:%d",sum());
    return 0;
}