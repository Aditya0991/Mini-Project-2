#include<stdio.h>
char ascii()
{
    char ch;
    printf("enter the character:");
    scanf("%c",&ch);
    printf("ascii value:%d",ch);
}
int main(){
    ascii();
    return 0;
}