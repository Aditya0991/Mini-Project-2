#include<stdio.h>
int main()
{
    int num,r,i=0;
    printf("enter the number:");
    scanf("%d",&num);
    while(num>0)
    {
        r=num%10;
        i=i*10+r;
        num=num/10;
        printf("value of i:%d\n",i);
    }
    printf("%d",i);
    return 0;
}