#include<stdio.h>
int main()
{
    int last;
    printf("enter the last number :");
    scanf("%d",&last);
    while(last>=1)
    {
        printf("%d\t",last);
        last--;
    }
    return 0;
}