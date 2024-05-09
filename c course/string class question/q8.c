#include<stdio.h>
int main()
{
    char x[100];
    int i;
    printf("enter the string:");
    gets(x);
    for(i=0;x[i]!='\0';i++)
    {
        if(x[i]>=65&&x[i]<=90)
        {
            x[i]=x[i]+32;
        }
        else if(x[i]>=97 && x[i]<=122)
        {
            x[i]=x[i]-32;
        }
        
    }
    printf("string:%s",x);
    return 0;
}