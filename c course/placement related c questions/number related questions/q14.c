#include<stdio.h>
int main()
{
    int num1,num2,i;
    printf("enter number 1:");
    scanf("%d",&num1);
    printf("enter number 2:");
    scanf("%d",&num2);
    for(i=0;i<num2;i++)
    {
        num1++;
    }
    printf("sum:%d",num1);
    return 0;
}