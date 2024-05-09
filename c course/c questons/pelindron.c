#include<stdio.h>
int main()
{
    int n,r,rev=0,orig;
    printf("enter the number:");
    scanf("%d",&n);
    orig=n;
    while(n>0)
    {
        r=n%10;
        rev=(rev*10)+r;
        n=n/10;
    }
    printf("%d",rev);
    if(rev==orig)
    {
        printf("number is palinstrom");
    }
    else
    {
        printf("number is not palinstrom");
    }
    return 0;
}