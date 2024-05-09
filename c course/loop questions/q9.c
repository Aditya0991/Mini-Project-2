#include<stdio.h>
int main(){
    int num,i,x;
    printf("enter the value of num you want mutiplication of:");
    scanf("%d",&num);
    for(i=1;i<=10;i++){
        x=num*i;
        printf("table is%d\n",x);
    }
    return 0;
}