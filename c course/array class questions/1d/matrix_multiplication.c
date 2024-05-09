#include<stdio.h>
int main()
{
    int x[3][3],y[3][3],i,j,k,sum=0,z[3][3];
    printf("enter the element of array x:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    printf("enter the element of array y:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&y[i][j]);
        }
    }

    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            for(k=0;k<3;k++)
            {
                sum=sum+x[i][k]*y[k][j];
                z[i][j]=sum;
            }
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d  ",z[i][j]);
        }
        printf("\n");
    }
    return 0;
}