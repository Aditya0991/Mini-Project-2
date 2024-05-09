#include<stdio.h>
int main()
{
    char x[50];
    int i,vowel=0,consonent=0;
    printf("enter the string:");
    gets(x);
    for(i=0;x[i]!='\0';i++)
    {
        if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u'||x[i]=='A'||x[i]=='E'||x[i]=='I'||x[i]=='O'||x[i]=='U')
        vowel++;

        else if(x[i]>='a'&&x[i]<='z'||x[i]>='A'&&x[i]<='Z')
        consonent++;
    }
    printf("total number of vowel:%d\n",vowel);
    printf("total number of consonent:%d\n",consonent);
    return 0;
}