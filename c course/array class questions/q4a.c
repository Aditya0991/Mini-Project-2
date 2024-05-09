#include<stdio.h>
int main(){
    int size,positive=0,negative=0,zero=0,i;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    for(i=0;i<size;i++){
        printf("enter the %d element of array: ",i+1);
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++){
        printf("%d\t",x[i]);
        if(x[i]>0){
            positive++;
        }
        else if(x[i]<0){
            negative++;
        }
        else{
            zero++;
        }
    }
    printf("number is positive:%d\n",positive);
    printf("number is negative:%d\n",negative);
    printf("number is zero:%d",zero);
    return 0;

}