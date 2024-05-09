#include<stdio.h>
int main()
{
    char x[80];
    int i=0,cout=1;
    printf("enter the string:");
    gets(x);
    while(x[i]!='\0')
    {
        if(x[i]==' ')
        {
            cout++;
        }
        i++;
    }
    printf("total number of words:%d",cout);
    return 0;
}