#include<stdio.h>
int main(){
    int n,i,r,c,sum=0,orig;
    printf("enter the number:");
    scanf("%d",&n);
    orig = n;
    while(n>0){
        r =n%10;
        c =r*r*r;
        sum =sum+c;
        n=n/10;

    }
    if(orig==sum){
        printf("number is armstrong");
    }
    else{
        printf("not armstrong");
    }
    return 0;
}