#include<stdio.h>
int main(){
    int a,b;
    printf("enter the value of a & b:");
    scanf("%d  %d",&a,&b);
    if(a%b==0)
    {
        printf("they can be multipulied");
    }
    else
    {
        printf("cannot not be multiplied");
    }
    return 0;
}