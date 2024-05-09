#include<stdio.h>
int main()
{
    int num,i=1;
    printf("enter the number:");
    scanf("%d",&num);
    printf("factor of enter number:");
    for(i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            printf("%d ",i);
        }
    }
    return 0;
}