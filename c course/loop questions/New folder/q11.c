#include<stdio.h>
int main()
{
    int num,l;
    printf("enter the number:");
    scanf("%d",&num);
    l=num%10;
    while(num>=10)
    {
        num=num/10;
    }
    printf("last digit:%d\n",l);
    printf("first number:%d",num);
    return 0;
}