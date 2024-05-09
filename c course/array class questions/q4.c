#include<stdio.h>
int main(){
    int size,i,positive=0,negative=0,zero=0;
    printf("enter size of array:");
    scanf("%d",&size);
    int num[size];
    for(i=0;i<size;i++){
        printf("enter the digit in %d: ",i+1);
        scanf("%d",&num[i]);
    }
    for(i=0;i<size;i++){
        printf("%d\t",num[i]);
        
        if(num[i]>0) positive++;
        else if(num[i]==0) zero++;
        else negative++;

    }
    printf("positive number in array:%d\n",positive++);
    printf("negative number in array:%d\n",negative++);
    printf("zero in array:%d\n",zero++);
    return 0;
}