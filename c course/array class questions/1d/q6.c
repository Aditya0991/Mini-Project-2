#include<stdio.h>
int main(){
    int size,i;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size],y[size];
    printf("enter the element of array :");
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    printf("element of array x:\n");
    for(i=0;i<size;i++){
        printf("%d  ",x[i]);
    }
    for(i=0;i<size;i++){
        y[i]=x[i];
    }

    printf("\narray y:\n");
    for(i=0;i<size;i++){
        printf("%d  ",y[i]);
    }
    return 0;
}