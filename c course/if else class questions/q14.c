#include<stdio.h>
int main(){
    int ang1,ang2,ang3,sum;
    printf("enter angle 1:");
    scanf("%d",&ang1);
    printf("enter angle 2:");
    scanf("%d",&ang2);
    printf("enter angle 3:");
    scanf("%d",&ang3);
    sum=ang1+ang2+ang3;
    if(sum==180){
        printf("triangle exist");
    }
    else{
        printf("triangle does not exist");
    }
    return 0;
}