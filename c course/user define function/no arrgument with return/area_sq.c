#include<stdio.h>
int sq()
{
    int length,breath,area;
    printf("enter length and breath:");
    scanf("%d %d",&length,&breath);
    area=length*breath;
}
int main()
{
    int sq1;
    sq1=sq();
    printf("area of square:%d",sq1);
    return 0;
}