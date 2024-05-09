#include<stdio.h>
#include<string.h>
int main()
{
    char x[50],y[50];
    printf("enter the element of x:\n");
    gets(x);
    printf("enter the element of y:\n");
    gets(y);
    printf("element of x\n");
    puts(x);
    printf("element of y\n");
    puts(y);
    if(strcmp(x,y)==0)
    {
        printf("string are equal");
    }
    else
    {
        printf("string are not equal");
    }
    return 0;
}