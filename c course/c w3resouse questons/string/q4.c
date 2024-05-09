#include<stdio.h>
int main()
{
    char x[50];
    int i=0,len=0;
    printf("enter the string:");
    gets(x);
    while(x[i]!='\0')
    {
        len++;
        i++;
    }
    printf("length:%d\n",len);
    for(i=len;i>=0;i--)
    {
        printf("%c ",x[i]);
    }
    return 0;
}