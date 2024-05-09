#include<stdio.h>
int main()
{
    int x[3][3],i,j,sumd=0,sumu=0;
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
            if(i==j)
            {
                sumd+=x[i][j];
            }
        }
    }
    // sum of upward diagonal-
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            if(i+j==2)
            {
                sumu+=x[i][j];
            }
        }
    }
    printf("sum of downward diagonal:%d\n",sumd);
    printf("sum of upward diagonal:%d\n",sumu);
    return 0;
}