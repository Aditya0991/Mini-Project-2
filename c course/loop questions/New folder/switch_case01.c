#include<stdio.h>
int main()
{
    int age;
    printf("enter your age:");
    scanf("%d",&age);
    switch(age)
    {
        case 1:printf("age is one\n");
        break;
        case 10:printf("age is ten\n");

        default:printf("age above 10 \n");
    }
    
    return 0;
}