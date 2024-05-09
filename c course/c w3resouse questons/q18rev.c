#include<stdio.h>
int main(){
    int num,i=0,rem;
    printf("enter the number:");
    scanf("%d",&num);
    
    while(num>0)
    {
        rem = num%10;
        i = i*10+rem;
        num =num/10;
    }

printf("reverse is the entered number:%d",i);
return 0;
}