#include<stdio.h>
int main(){
    int size,i,ele,pos;
    printf("enter the size of array:");
    scanf("%d",&size);
    size++;
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size-1;i++){
        scanf("%d",&x[i]);
    }
    printf("enter the element to insert: ");
    scanf("%d",&ele);
    printf("enter the position: ");
    scanf("%d",&pos);
    pos--;
    for(i=size-1;i>=pos;i--){
        x[i+1]=x[i];
    }
    x[pos]=ele;
    printf("new array after insertion:\n");
    for(i=0;i<size;i++){
        printf("%d ",x[i]);
    }
    return 0;
}