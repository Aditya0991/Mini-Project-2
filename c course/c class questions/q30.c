#include<stdio.h>
int main(){
    int principal,rate,time;
    printf("enter principal amount:\n");
    scanf("%d",&principal);
    printf("enter rate:\n");
    scanf("%d",&rate);
    printf("enter time:\n");
    scanf("%d",&time);
    printf("simpe intrest = %f",(principal*rate*time)/100);
    return 0;
}