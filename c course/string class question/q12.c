#include<stdio.h>
int main()
{
    char x[50],ch;
    int i,count=0;
    printf("enter the string:");
    gets(x);
    for(i=0;x[i]!='\0';i++)
    { 
        count++;
    }
    printf("count:%d\n",count);
    for(i=0;i<(count-1)/2;i++)
    {
        ch=x[i];
        x[i]=x[count-1-i];
        x[count-1-i]=ch;
    }
    printf("%s",x);
    return 0;
}