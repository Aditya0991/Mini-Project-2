#include<stdio.h>
int main()
{
    int num,r,rev=0;
    printf("enter the number :");
    scanf("%d",&num);
    while (num!=0)
    {
        r=num%10;
        rev=rev*10+r;
        num=num/10;
    }
    printf("%d",rev);
    return 0;
}