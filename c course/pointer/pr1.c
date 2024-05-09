#include<stdio.h>
int main()
{
    int a=5;
    int *p=&a;
    printf("value of a :%d and from pointer:%d",a,*p);
    printf("\naddress of a is:%d and from pointer:%d",&a,p);
    printf("\naddress of p:%u",&p);
    printf("\nvalue at p:%d",*(&p));
    // printf("\nwhen we add 1 in address:%d",p+1);
    // printf("\nwhen we add 2 in address:%d",p+2);
    
    

    return 0;
}