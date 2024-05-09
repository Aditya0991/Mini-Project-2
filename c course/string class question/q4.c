#include<stdio.h>
#include<string.h>
int main()
{
    char x[50];
    printf("enter the string:");
    gets(x);
    
    strupr(x);
    printf("in upper case:%s",x);
    return 0;
}