#include<stdio.h>
#include<string.h>
int main()
{
    char x[50];
    printf("enter the string:");
    gets(x);
    strlwr(x);
    printf("string in lower case:");
    puts(x);
    return 0;
}