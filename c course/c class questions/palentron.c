#include<stdio.h>
int main(){
    int num,rev=0,rem,orig;
    printf("enter the number:");
    scanf("%d",&num);
    orig=num;
    while(num>0){
        rem =num%10;
        rev = (rev*10)+rem;
        num=num/10;
    }
    printf("%d",rev);
    if(orig==rev){
        printf("number is palindron");
    }
    else{
        printf("number is not palindron");
    }
    
    return 0;
}