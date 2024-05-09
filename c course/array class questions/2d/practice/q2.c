#include<stdio.h>
int main()
{
    int x[3][3],y[3][3],i,j;
    printf("enter the element 1st of 3*3 matrix:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }

    printf("enter the element 2nd of 3*3 matrix:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            scanf("%d",&y[i][j]);
        }
    }
    printf("addition of two matrix:\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            printf("%d  ",x[i][j]+y[i][j]);
        }
        printf("\n");
    }
    return 0;
}