#include<stdio.h>
int main(){
    int a,b,c;
    printf("enter side a:");
    scanf("%d",&a);
    printf("enter side b:");
    scanf("%d",&b);
    printf("enter side c:");
    scanf("%d",&c);

    if(a==b && b==c){
        printf("its a eqilateral triangle");
    }
    else if(a==b || b==c || c==a){
        printf("its a isoscales triangle");
    }
    else{
        printf("its a scalent triangle");
    }
    return 0;
}