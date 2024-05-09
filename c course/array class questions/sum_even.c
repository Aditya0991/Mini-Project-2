#include<stdio.h>
int main(){
    int size,i,sum=0;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d of array",i+1);
        scanf("%d",&x[i]);
        
    }
    for(i=0;i<size;i++){
        // printf("%d\t",x[i]);
        if(x[i]%2==0){
            sum+=x[i];
        }
    }
    printf("sum of even number of array: %d",sum);
    return 0;
}