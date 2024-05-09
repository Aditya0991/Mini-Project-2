#include<stdio.h>
int main()
{
    char x[20];
    int i=0;
    printf("enter the string:");
    gets(x);
    while(x[i]!='\0')
    {
        printf("%c ",x[i]);
        i++;
    }
    return 0;
}