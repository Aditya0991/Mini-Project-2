#include<stdio.h>
int main(){
    int size,i,sum=0;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d of array:",i+1);
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++){
        sum+=x[i];
    }
    printf("%d",sum);
    return 0;
}