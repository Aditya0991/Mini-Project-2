#include<stdio.h>
int main()
{
    int n,i,sum=0;
    printf("enter the number:");
    scanf("%d",&n);
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }   
    }
    if(n==sum)
        {
            printf("number is a perfect number");
        }
    else
        {
            printf("number is not a perfect number");
        }
    return 0;
}