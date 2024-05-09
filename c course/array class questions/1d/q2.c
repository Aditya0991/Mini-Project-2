#include<stdio.h>
int main(){
    int size,i;
    printf("enter size of array:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d element in array: ",i+1);
        scanf("%d",&x[size]);
    }
    for(i=size-1;i>=0;i--){
        printf("%d\t",x[i]);
    }
    return 0;
}