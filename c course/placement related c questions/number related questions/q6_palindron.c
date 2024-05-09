#include<stdio.h>
int main()
{
    int num,orig,r,i=0;
    printf("enter the number:");
    scanf("%d",&num);
    orig=num;
    while(num>0)
    {
        r=num%10;
        i=i*10+r;
        num=num/10;
    }
    if(i==orig)
    {
        printf("number is palindron");
    }
    else{
        printf("number is not palindron");
    }
    return 0;
}