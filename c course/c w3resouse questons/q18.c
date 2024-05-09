#include<stdio.h>
int main(){
    int num,i=0,r;
    printf("enter the number:");
    scanf("%d",&num);

    while(num>0)
    {
        r =num%10;
        i =i*10+r;
        num = num/10;
    }
    printf("reverse:%d",i);
return 0;
}