#include<stdio.h>
int main(){
    
    int i,num[5],sum=0;
    printf("enter number 1:");
    scanf("%d",&num[0]);
    printf("enter number 2:");
    scanf("%d",&num[1]);
    printf("enter number 3:");
    scanf("%d",&num[2]);
    printf("enter number 4:");
    scanf("%d",&num[3]);
    printf("enter number 5:");
    scanf("%d",&num[4]);

    for(i=0;i<5;i++)
    {
        if((num[i]%2)!=0)
        {
            sum+=num[i];
        }
    }
    printf("total:%d",sum);
    return 0;
    
}