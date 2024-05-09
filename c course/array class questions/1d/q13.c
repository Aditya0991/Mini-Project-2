#include<stdio.h>
int main(){
    int size,i,neg=0;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d of array: ",i+1);
        scanf("%d",&x[i]);
        
    }
    for(i=0;i<size;i++){
        
        if(x[i]<0){
            
            neg++;
            
        }
        else{
            printf("\n no negative number");
            break;
        }
    }
    printf("\ntotal negative number:%d",neg);
    return 0;
}