#include<stdio.h>
int main(){
    int n,orig,r,sum,rev=0;
    printf("enter the number:");
    scanf("%d",&n);
    orig=n;
    while(n>0){
        r=n%10;
        rev =(rev*10)+r;
        n=n/10;
    }
    printf("%d",rev);
    if(orig==rev){
        printf("number is palenstron");
    }
    else{
        printf("not palenstron");
    }
    return 0;
}