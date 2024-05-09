#include<stdio.h>
int sum(int a,int b);
int main()
{
    int c,x;
    c = sum(5,4);
    x = sum(2,3);
    printf("sum1:%d",c);
    printf("sum2:%d",x);
    return 0;
}

int sum(int a,int b)
{
    int result;
    result=a+b;
    return result;
}