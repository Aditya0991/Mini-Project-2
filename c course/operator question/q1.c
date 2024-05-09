#include<stdio.h>
int main()
{
    int num1,num2;
    printf("enter number 1 and 2:");
    scanf("%d %d",&num1,&num2);
    (num1>num2)?printf("number 1 is greater"):printf("number 2 is greater");
    return 0;

}