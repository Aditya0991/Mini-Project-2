#include<stdio.h>
int main()
{
    int day;
    printf("enter the day number:");
    scanf("%d",&day);
    switch(day)
    {
        case 1:printf("Monday");
        break;
        case 2:printf("Tuesday");
        break;
        case 3:printf("Wednesday");
        break;
        case 4:printf("thersday");
        break;
        case 5:printf("friday");
        break;
        case 6:printf("saturday");
        break;
        case 7:printf("sunday");
        break;
        default:printf("invalid number enterd");
    }
    return 0;
}