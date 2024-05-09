#include<stdio.h>
int main()
{
    int year;
    printf("enter the year:");
    scanf("%d",&year);
    (year%4==0)?printf("leap year"):printf("not a leap year");
    return 0;

}