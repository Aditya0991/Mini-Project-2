#include<stdio.h>
int main(){
    int a,b;
   
    printf("enter the value of a:");
    scanf("%d",&a);
    printf("enter the value of b:");
    scanf("%d",&b);
   
    printf("quotient:%d \n",a/b);
    printf("remainder:%d",a%b);
    return 0;
}