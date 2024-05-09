#include<stdio.h>
int main(){
    int num,counter=0;
    printf("enter the number :");
    scanf("%d",&num);

    if(num == 0){
        printf("there is only one digit");
    }
    else{
    while(num!=0){
        num=num/10;
        counter++;
        
    }
    }
    printf("number of digits:%d",counter);

    return 0;
}