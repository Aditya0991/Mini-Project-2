#include<stdio.h>
int main(){
    int n,i;
    printf("enter the value of n:");
    scanf("%d",&n);
    printf("all factor of %d are: ",n);
    for(i=1;i<=n;i++)
    {
    if(n%i==0)
    {
        printf("%d, ",i);
    } 
    }
  
    
    return 0;
}