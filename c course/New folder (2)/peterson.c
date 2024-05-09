#include<stdio.h>
int main(){
    int n,orig,fact,r,i,sum=0;
    printf("enter the number:");
    scanf("%d",&n);
    n=orig;
   
    while(n>0)
    {
    r=n%10;
    fact=1;
    for(i=r;i>=1;i--)
    {
        fact =fact*1;
    }
    sum=sum+fact;
    n=n/10;
    }
    if(sum==orig)
    {
        printf("number is peterson");
    }
    else
    {
        printf("number is not peterson");
    }
    return 0;
}