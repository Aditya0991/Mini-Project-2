#include<stdio.h>
int main(){
    int min,a,b,i,hcf;
    printf("enter the value of a and b:");
    scanf("%d %d",&a,&b);
    min =(a<b)?a:b;
    for(i=1;i<=min;i++){
        if(a%i==0 && b%i==0){
            hcf =i;
        }
    }
    printf("hcf of %d %d is%d:",a,b,hcf);
    return 0;
}