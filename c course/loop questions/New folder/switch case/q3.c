#include<stdio.h>
#include<conio.h>
int main()
{
    int num1,num2;
    char opr;
    printf("enter number 1:");
    scanf("%d",&num1);
    printf("enter number 2:");
    scanf("%d",&num2);
    printf("chose the operation you want to perform +,-,*,/:");
    opr=getch();
    // scanf("%c",&opr);
    switch(opr)
    {
        case '+':printf("\naddition:%d",num1+num2);
        break;
        case '-':printf("\nsubstraction:%d",num1-num2);
        break;
        case '*':printf("\nmultiplication:%d",num1*num2);
        break;
        case '/':printf("\ndivision:%d",num1/num2);
        break;
        default:printf("enter the right operator");
    }
    return 0;
}