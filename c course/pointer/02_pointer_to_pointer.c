#include<stdio.h>
int main()
{
    int x=5;
    int *p=&x;
    int **pp=&p;
    printf("\n\nvalue of x:%d from pointer :%d and %d",x,*p,**pp);
    printf("\n\naddress of x:%d from pointer:%d",&x,p,*pp);
    printf("\n\nvalue of p:%d from pointer :%d and ",p,*pp);
    printf("\n\naddress of p:%d from pointer:%d",&x,&p,pp);
    printf("\n\nvalue of pp:%d from pointer :%d and ",&p,pp);

    return 0;
}