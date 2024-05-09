#include<stdio.h>
int main(){
    int x[3],i;
    for(i=0;i<3;i++){
        printf("enter element of array:");
        scanf("%d",&x[i]);
    }
    for(i=2;i>=0;i--){
        printf("%d ",x[i]);
    }
    return 0;
}