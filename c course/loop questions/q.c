#include<stdio.h>
int main(){
    float x;
    printf("enter the value of x:");
    scanf("%f",&x);
    if(x<4.7){
        printf("when is less then 4.7:%f",3*x+2);
    }
    else if(x==4.7){
        printf("when is equal to 4.7:%f",21.2*x -0.8);
    }
    else{
        printf("when x is greater than 4.7:%f",21.3*x-1.6);
    }
    return 0;
    }