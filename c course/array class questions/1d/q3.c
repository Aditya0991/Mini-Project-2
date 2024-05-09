#include<stdio.h>
int main(){
    int size,i,max;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    max=x[0];
    printf("largest element:");
    for(i=0;i<size;i++){
        if(max<x[i]){
            max=x[i];
        }
    }
    printf("%d",max);
    return 0;
}