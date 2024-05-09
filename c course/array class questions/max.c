#include<stdio.h>
int main(){
    int size,i,max;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d element in array:",i+1);
        scanf("%d",&x[i]);
    }
    max=x[0];
    for(i=0;i<size;i++){
        // printf("%d",&x[i]);
        if(max<x[i]){
            max=x[i];
        }
    }
    printf("maximum element of array is %d",max);
    return 0;
}