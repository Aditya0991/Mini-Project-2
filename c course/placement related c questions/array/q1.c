#include<stdio.h>
int main()
{
    int num,sum,sumx=0,i,size;
    printf("enter the last number:");
    scanf("%d",&num);
    sum=num*(num+1)/2;
    printf("sum n natural number:%d",sum);
    printf("\nenter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("\nenter the element of array:");
    for(i=0;i<size;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++)
    {
        sumx+=x[i];
    }
    printf("sum of entered array:%d\n",sumx);
    printf("element not present:%d",sum-sumx);
    return 0;
}