#include<stdio.h>
int main(){
    int amount,total;
    printf("enter the amount:");
    scanf("%d",&amount);

    total =amount/100;
    printf("total 100 rs notes:%d",total);

    // amount = amount-(total*100);

    total =amount/50;
    printf("total 50 rs notes:%d",total);
    return 0;
}