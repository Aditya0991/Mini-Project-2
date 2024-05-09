#include<stdio.h>
int main(){
    int n;
    printf("enter the value of n:");
    scanf("%d",&n);
    while(n>=1){
        printf("%d\n",n);
        n =n-1;
    }
    
    return 0;

}