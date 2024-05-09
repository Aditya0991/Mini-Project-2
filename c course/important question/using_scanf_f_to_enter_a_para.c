#include<stdio.h>
int main()
{
    char s[100];
    printf("Enter the string :");
    scanf("%[^\n]%*c", s); 
    puts(s);
    return 0;
}