#include<stdio.h>
int main()
{
    int n,r,fact,i,sum=0,orig;
    printf("enter the value:");
    scanf("%d",&n);
    orig=n;
    while(n>0)
    {
        r=n%10;
        for(i=r;i>=1;i--)
        {
            fact =fact*1;
        }
        sum =sum+fact;
     
        n=n/10;
    }
    if(sum==orig)
    {
        printf("petersons");
    }
    else{
        printf("not");
    }
return 0;
}