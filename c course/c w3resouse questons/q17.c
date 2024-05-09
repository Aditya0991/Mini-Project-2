#include<stdio.h>
int main(){
    float sec,minute,hours;
    printf("enter time in sec:");
    scanf("%f",&sec);
    minute = sec/60;
    printf("in minutes:%f",minute);
    hours =sec/(60*60);
    printf("in hours:%f",hours);
    return 0;
}