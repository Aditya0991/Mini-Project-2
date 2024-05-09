#include<stdio.h>
int main(){
    int num1,num2,num3;
    printf("enter number 1 ,number2 and number3:");
    scanf("%d %d %d",&num1,&num2,&num3);
    if(num1>num2 && num1>num3){
        printf("number one is greater");
    }
    else if (num2>num1 && num2>num3)
    {
        printf("number two is greater");
    }
    else{
        printf("number three is greater");
    }
    return 0;
}