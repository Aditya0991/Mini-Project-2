#include<stdio.h>
int main()
{
    int num,a=0,b=1,c,i;
    printf("enter the number till which you want to print the series:");
    scanf("%d",&num);
    for(i=1;i<=num;i++)
    {
        printf("%d\t",a);
        c=a+b;
        a=b;
        b=c;
    }

    return 0;
}