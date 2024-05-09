#include<stdio.h>
int main()
{
    int num,i=1,sum=0;
    printf("enter the last number to print till:");
    scanf("%d",&num);
    while (i<=num)
    {
        sum+=i;
        i++;
    }
    printf("%d",sum);
    return 0;
}