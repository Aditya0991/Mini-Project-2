#include<stdio.h>
#include<string.h>
int main()
{
    char x[50],y[50];
    printf("enter the element of x:");
    gets(x);
    printf("enter the element of y:");
    gets(y);
    strcpy(x,y);
    printf("element of y:\n");
    
    puts(y);
    puts(x);
    return 0;
}