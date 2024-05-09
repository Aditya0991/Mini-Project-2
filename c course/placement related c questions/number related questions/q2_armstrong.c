#include<stdio.h>
int main()
{
    int num,r,cube,sum=0,orig;
    printf("enter the number :");
    scanf("%d",&num);
    orig=num;
    while(num>0)
    {
        r=num%10;
        cube=r*r*r;
        sum=sum+cube;
        num=num/10;
    }
    if(orig==sum)
    {
        printf("number is armstrong");
    }
    else
    {
        printf("number is not armstrong");
    }
    return 0;
}