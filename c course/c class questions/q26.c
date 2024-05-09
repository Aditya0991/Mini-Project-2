#include<stdio.h>
int main(){
    int angle1,angle2,angle3;
    printf("enter angle1:");
    scanf("%f",&angle1);
    printf("enter angle2:");
    scanf("%f",&angle2);
    // angle3=180-(angle1+angle2);
    printf("so the third angle is:%d",angle1+angle2);
    return 0;
}