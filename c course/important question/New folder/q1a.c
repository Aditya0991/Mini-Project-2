#include<stdio.h>
int main()
{
    int num,rem,sum=0,x,orig;
    printf("enter the number:");
    scanf("%d",&num);
    orig=num;
    while(num>0)
    {
        rem=num%10;
        x=rem*rem*rem;
        sum=sum+x;
        num=num/10;
    }
    if(orig==sum)
    {
        printf("number is armstrong");
    }
    else
    {
        printf("number in not armstrong");
    }
    return 0;
}