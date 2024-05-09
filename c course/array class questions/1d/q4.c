#include<stdio.h>
int main(){
    int size,i,min;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array: ");
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    min=x[0];
    for(i=0;i<size;i++){
        if(min>x[i]){
            min = x[i];
        }
    }
    printf("minimum element:%d",min);
    return 0;
}