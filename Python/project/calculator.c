// wrong
#include<stdio.h>
int main()
{
    int num1,num2,result;
    char opr;
    printf("enter number 1:");
    scanf("%d",&num1);
    printf("enter number 2:");
    scanf("%d",&num2);
    printf("enter a valid operator:");
    scanf("%c",&opr);
    if(opr=='+')
    {
        printf("sum:%d",num1+num2);
    }
    else if(opr=='-')
    {
        printf("sum:%d",num1-num2);
    }
    else if(opr=='*')
    {
        printf("sum:%d",num1*num2);
    }
    else if(opr=='/')
    {
        printf("sum:%d",num1/num2);
    }
    else
    {
        printf("enter a valid operator");
    }
    return 0;
}