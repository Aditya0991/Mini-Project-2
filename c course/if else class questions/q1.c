#include<stdio.h>
int main(){
    int num1,num2;
    printf("enter the num1 and num2:");
    scanf("%d %d",&num1,&num2);
    if(num1>num2){
        printf("number one is greater");
    }
    else{
        printf("number two is greater");
    }
    return 0;
}