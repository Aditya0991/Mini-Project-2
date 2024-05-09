#include<stdio.h>
int main(){
    int amount,x,r,y,r1,z;
    printf("enter the amount:");
    scanf("%d",&amount);
    x=amount/2000;
    printf("number of 2000 notes:%d\n",x);
    r=amount%2000;
    y=r/500;
    printf("number of 500 notes:%d\n",y);
    r1=r%500;
    z=r1/100;
    printf("number of 100 notes:%d",z);


    return 0;
}