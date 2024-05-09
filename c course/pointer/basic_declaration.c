#include<stdio.h>
int main()
{
    int a=4,*p,**pa;
    p=&a;
    pa=&p;
    printf("value of a :%d and from pointer :%d and :%d\n",a,*p,**pa);
    printf("address of a :%d and from pointer :%d\n",&a,p);
    // value and address of p;
    printf("value of p :%d and from pointer :%d\n",&a,*pa);
    printf("address of p :%d and from pointer :%d\n",&p,pa);
    return 0;
}