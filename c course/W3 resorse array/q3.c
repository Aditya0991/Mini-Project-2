#include<stdio.h>
int main()
{
    int size,i,sum=0;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter element of array: ");
    for(i=0;i<size;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++)
    {
        sum+=x[i];
    }
    printf("sum of array:%d",sum);
    return 0;
}