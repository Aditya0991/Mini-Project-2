#include<stdio.h>
int main()
{
    int x[3][3],i,j;
    printf("enter the element of 3*3 matrix:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d  ",x[i][j]);
        }
        printf("\n");
    }
    printf("\ntranspose of matrix:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d  ",x[j][i]);
        }
        printf("\n");
    }
    return 0;
}