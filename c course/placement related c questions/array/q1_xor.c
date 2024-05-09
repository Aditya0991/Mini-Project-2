#include<stdio.h>
int main()
{
    int num,i,x[100],sum=0;
    printf("enter the last natural number:");
    scanf("%d",&num);
    for(i=1;x[i]<num;i++)
    {
        sum^x[i];
    }
    printf("%d",sum);
    return 0;
}