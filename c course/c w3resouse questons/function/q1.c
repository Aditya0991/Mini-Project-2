#include<stdio.h>
int sum(int a,int b)
{
    int c;
    c=a+b;
    return c;
}
int main()
{
    int total,a,b;
    total=sum(4,5);
    printf("sum:%d",total);
    return 0;
}


