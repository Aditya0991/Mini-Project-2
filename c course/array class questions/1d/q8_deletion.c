#include<stdio.h>
int main(){
    int size,i,pos;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    printf("enter the position element:");
    scanf("%d",&pos);
    
    for(i=pos;i<size;i++){
        x[i]=x[i+1];
    }
    printf("array after deletion:\n");
    for(i=0;i<size-1;i++){
        printf("%d ",x[i]);
    }
    return 0;
}