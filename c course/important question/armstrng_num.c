#include<stdio.h>
int main(){
    int n,r,c,sum=0,temp;
    printf("enter the value of n:");
    scanf("%d",&n);
    temp=n;
    while(n>0){
        r=n%10;
        c=r*r*r;
        sum =sum+c;
        n=n/10;
    }
    
    if(temp==sum){
        printf("number is armstron");
    }
    else{
        printf("not armston");
    }
    return 0;
}