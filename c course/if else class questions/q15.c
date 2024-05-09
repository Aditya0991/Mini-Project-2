#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter side a:");
    scanf("%d",&a);
    printf("enter side b:");
    scanf("%d",&b);
    printf("enter side c:");
    scanf("%d",&c);
    if(a+b>c && b+c>a && c+a>b){
        printf("triangle exist");
    }
    else{
        printf("triangle does not exist");
    }
    return 0;
    
}