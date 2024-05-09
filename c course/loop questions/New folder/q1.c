#include<stdio.h>
int main()
{
    int end,i=1;
    printf("enter the last number to print till:");
    scanf("%d",&end);
    while(i<=end)
    {
        printf("%d\t",i);
        i++;
    }
    return 0;
}