#include<stdio.h>
int main()
{
    int a=7,b=55;
    printf("value before swaping a:%d and b:%d\n",a,b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("\nvalue after swaping a:%d and b:%d",a,b);
    
    return 0;
}