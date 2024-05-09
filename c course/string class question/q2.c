#include<stdio.h>
#include<string.h>
int main()
{
    char x[50];
    int len;
    printf("enter the element of x:\n");
    gets(x);
    len=strlen(x);
    printf("length of string x:%d",len);
    return 0;
}