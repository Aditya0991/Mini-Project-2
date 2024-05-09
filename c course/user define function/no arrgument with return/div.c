#include<stdio.h>
int div()
{
    int a,b,d,r;
    printf("enter the value of a and b:");
    scanf("%d %d",&a,&b);
    d=a/b;
    
}
int main()
{
    int x,r;
    x=div();
    printf("quotient:%d\n",x);
    
    return 0;
}