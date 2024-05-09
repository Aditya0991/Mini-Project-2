#include<stdio.h>
int main(){
    int first,last,num;
    printf("enter the number:");
    scanf("%d",&num);
    last = num%10;
    while(num>=10)
        {
            num=num/10;
        }
    first=num;

    printf("first digit=%d and last digits =%d:",first,last);
    return 0;
    }