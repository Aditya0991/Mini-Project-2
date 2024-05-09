#include<stdio.h>
int main()
{
    int num=1,last,sum=0;
    printf("enter the last number:");
    scanf("%d",&last);
    while(num<=last)
    {
        if(num%2==0)
        {
           sum+=num; 
        }
        num++;
    }
    printf("sum:%d",sum);
    return 0;
}