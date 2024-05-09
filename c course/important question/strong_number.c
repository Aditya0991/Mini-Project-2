#include<stdio.h>
int main(){
    int n,r,i,fact=1,sum=0,orig;
    printf("enter the value of n:");
    scanf("%d",&n);
    n=orig;
    r=n%10;
    
    while(n>0)
    {
    for(i=r;i>=1;i--)
    {
        fact =fact*1;
    }
    sum=sum+fact;
    n=n/10;
    }
    if(orig==sum){
        printf("number if strong number");
    }
    else{
        printf("number is not strong number");
    }
    return 0;
}