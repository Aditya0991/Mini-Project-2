#include<stdio.h>
#include<math.h>
int main(){
    int x,y,result;
    printf("enter the number:");
    scanf("%d",&x);
    printf("enter its power:");
    scanf("%d",&y);

    result=pow(x,y);
    printf("cube:%d",result);
    return 0;
}