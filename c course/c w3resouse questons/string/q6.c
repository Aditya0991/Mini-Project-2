#include<stdio.h>
int main()
{
    char x[50],y[50],m=0,n=0;
    int i=0;
    printf("enter the string x:");
    gets(x);
    printf("enter the string y:");
    gets(y);
    while(x[i]!='\0'||y[i]!='\0')
    {
        if(x[i]==y[i])
        {
            m++;
        }
        else
        {
            n++;
        }
        i++;
    }
    if(n>0)
    {
        printf("string are not equal");
    }
    else{
        printf("string are equal");
    }
    return 0;
}