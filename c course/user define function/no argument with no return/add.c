#include<stdio.h>
int sum(void)
{
    int a,b,c;
    printf("enter the value of a and b: ");
    scanf("%d %d",&a,&b);
    c=a+b;
    printf("sum of a and b: %d",c);
    return c;
}
int main()
{
    sum();
    return 0;
}