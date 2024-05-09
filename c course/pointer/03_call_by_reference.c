#include<stdio.h>
void swap(int *x,int *y);
int main()
{
    int x=5,y=10;
    printf("value before swap x:%d and y:%d\n",x,y);
    swap(&x,&y);
    printf("value after swap x:%d and y:%d\n",x,y);

    return 0;
}

void swap(int *x,int *y)
{
    int orig;
    orig=*x;
    *x=*y;
    *y=orig;
}