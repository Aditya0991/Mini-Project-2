#include<stdio.h>
#include<string.h>
int main()
{
    char x[50],y[50],ch;
     
    printf("enter string x:");
    gets(x);
    printf("enter string y:");
    gets(y);
    strcat(x,y);
    puts(x);
    return 0;
}