#include<stdio.h>
int main(){
    int size,i,neg=0;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++)
    {
        if(x[i]<0){
            neg++;
        }
    }
    printf("total negative number:%d",neg);
    return 0;
}