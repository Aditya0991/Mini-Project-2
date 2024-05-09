#include<stdio.h>
int main()
{
    int a=5,*x,**y;
    x=&a;
    y=&x;
    printf("value of a:%d form pointer:%d and %d\n",a,*x,**y);
    printf("address of a:%d and from pointer:%d and %d\n",&a,x,*y);
    printf("value of x:%d and %d\n",x,*y);
    printf("address of x:%d\n",&x,y);
    printf("value of y:%d\n",&x);

    return 0;
}