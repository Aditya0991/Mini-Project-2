#include<stdio.h>
int main(){
    int size,i,min;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d element of array:",i+1);
        scanf("%d",&x[i]);
    }
    min=x[0];
    for(i=0;i<size;i++){
        
        if(min>x[i]){
            min=x[i];
        }
    }
    printf("minimum element in array: %d",min);
}