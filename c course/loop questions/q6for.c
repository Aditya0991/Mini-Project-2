#include<stdio.h>
int main(){
    int num,n,sum=0;
    printf("enter the num :");
    scanf("%d",&num);
    for(n=1;n<=num;n++){
        sum+=n;
    }
    printf("sum :%d",sum);
    return 0;
}