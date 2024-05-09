#include<stdio.h>
#include<string.h>
int main()
{
    char x[50];
    printf("enter the string:\n");
    gets(x);
    strrev(x);
    printf("string in reverse:\n");
    puts(x);
    return 0;
}