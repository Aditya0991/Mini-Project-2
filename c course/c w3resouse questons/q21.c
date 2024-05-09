#include<stdio.h>
int main(){
    int x;
    printf("input an intger:");
    scanf("%d",&x);
    
    if(0<=x && x<=20)
    {
        printf("range is[0,20]");
    }

    else if(21>=x && x>=40)
    {
        printf("range is[21,40]");
    }

    else{printf("out of range");}

    return 0;
}