#include<stdio.h>
int main(){
    int size,i,ele;
    printf("enter the size:");
    scanf("%d",&size);
    printf("enter the element of array:");
    int x[size];
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++){
        printf("%d ",x[i]);
    }
    printf("\n enter the element to find:\n");
    scanf("%d",&ele);
    for(i=0;i<size;i++){
        if(ele==x[i]){
            printf("number is present ");
            printf("at position: %d",i+1);
            break;
        }
        // else{
        //     printf("number is not present\n");
            
        // }
        
    }
   
    return 0;
}