#include<stdio.h>
int main()
{
    char x[50],i,word=1;
    printf("enter the string:");
    gets(x);
    for(i=0;x[i]!='\0';i++)
    {
        if(x[i]==' ')
        {
            word=word+1;
        }
    }
    printf("total number of words:%d",word);
    return 0;
}