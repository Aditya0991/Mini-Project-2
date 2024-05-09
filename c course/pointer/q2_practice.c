#include<stdio.h>
void i(int x)
{
    printf("value of x:%d\n",x);
    printf("address of x:%d\n",&x);
}
int main()
{
    int a=5;
    printf("value of a:%d\n",a);
    i(a);
    printf("address of variable a:%d\n",&a);
    return 0;
}