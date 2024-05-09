#include<stdio.h>
int main()
{
    int size,i,j,temp;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size-1;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<size-1;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(x[i]>x[j])
            {
                temp=x[i];
                x[i]=x[j];
                x[j]=temp;
            }
        }
    }
    for(i=0;i<size-1;i++)
    {
        printf("%d\t",x[i]);
    }
    return 0;
}