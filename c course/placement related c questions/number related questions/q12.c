#include<stdio.h>
int main()
{
    int a=5,b=10,temp;
    printf("valua before swaping a:%d and b:%d",a,b);
    temp=a;
    a=b;
    b=temp;
    printf("\nvalue after swaping a:%d and b:%d",a,b);
    return 0;
}