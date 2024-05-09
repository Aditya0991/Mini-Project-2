#include<stdio.h>
char ascii()
{
    char ch;
    printf("enter the character :");
    scanf("%c",&ch);
    return ch;
}
int main()
{
    int x;
    x=ascii();
    printf("%d",x);
    return 0;
}