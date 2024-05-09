#include<stdio.h>
int main(){
    int num,count=1,sum=0;
    printf("enter the value of num:");
    scanf("%d",&num);
    while(count<=num){
        sum = sum+count;
        count++;

    }
        printf("%d",sum);
    
    return 0;
}