#include<stdio.h>
int main(){
    int size,i,j,swap;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size];
    printf("enter the elements:");
    for(i=0;i<size;i++){
        scanf("%d",&x[i]);
    }
    for(i=0;i< size;i++){
        for(j=i+1;j<size;j++){
            if(x[i]>x[j]){
                swap=x[i];
                x[i]=x[j];
                x[j]=swap;
            }
        }
    }
    for(i=0;i<size;i++){
        printf("%d  ",x[i]);
    }
return 0;
}