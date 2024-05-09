#include<stdio.h>
int main()
{
    char x[50];
    int i=0,len=0;
    printf("enter the string:");
    gets(x);
    while(x[i]>'\0')
    {
        len++;
        i++;
    }
    printf("length of string:%d",len);
    return 0;
}