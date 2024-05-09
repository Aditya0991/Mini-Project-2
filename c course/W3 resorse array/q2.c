#include<stdio.h>
int main()
{
    int size,i;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter element of array: ");
    for(i=0;i<size;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=size-1;i>=0;i--)
    {
        printf("%d\t",x[i]);
    }
    return 0;
}