#include<stdio.h>
int main(){
    int marks[4],i;
    int *ptr;
    ptr = &marks[0];
    for(i=0;i<4;i++){
        printf("enter the marks of %d:",i+1);
        scanf("%d",ptr);
        ptr++;
    }
    for(i=0;i<4;i++){
        printf("value of marks:%d\n",marks[i]);
    }
    return 0;
}