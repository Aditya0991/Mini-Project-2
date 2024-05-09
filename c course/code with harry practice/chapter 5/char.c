#include<stdio.h>
int main(){
    int size,i;
    printf("enter the size of array:");
    scanf("%d",&size);
    char x[size];
    for(i=0;i<size;i++){
        printf("enter the %d character of array:",i+1);
        scanf("%s",&x[i]);
    }
    for(i=0;i<size;i++){
        printf("%c\t",x[i]);
    }
    
    return 0;
}