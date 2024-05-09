#include<stdio.h>
int main()
{
    int x[80],i=0,len=0;
    printf("enter the element of array:");
    gets(x);
    while(x[i]>!'0')
    {
        len++;
        i++;
    }
    printf("length of array:%d",len);
    return 0;
}