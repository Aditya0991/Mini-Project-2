#include<stdio.h>
int main()
{
    char x[500];
    int alph,digit,other,i;
    alph=digit=other=i=0;
    printf("enter the string:");
    gets(x);
    while(x[i]!='\0')
    {
        if((x[i]>='a' && x[i]<='z') || (x[i]>='A' && x[i]>='Z'))
        {
            alph++;
        }
        else if(x[i]>='0'&&x[i]<='9')
        {
            digit++;
        }
        else
        {
            other++;
        }
        i++;
    }
    printf("total alphabets:%d\n",alph);
    printf("total digit:%d\n",digit);
    printf("total special character:%d\n",other);
    return 0;
}