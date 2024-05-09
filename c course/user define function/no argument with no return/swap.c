#include<stdio.h>
int swap()
{
    int a,b,c;
    printf("enter the value of a and b:");
    scanf("%d %d",&a,&b);
    c=a;
    a=b;
    b=c;
    printf("value of a: %d\n",a);
    printf("value of b: %d",b);
}

int main(){
    swap();
    return 0;
}