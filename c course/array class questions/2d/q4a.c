#include<stdio.h>
int main()
{
    int x[3][3],y[3][3],z[3][3],i,j,sum=0;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        scanf("%d",&x[i][j]);
    }
    printf("array x");
    for(i=0;i<3;i++)
    {   for(j=0;j<3;j++){
        printf("%d",x[i][j]);
        }
    }
    
    // array y;
    printf("enter the element of array y:");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        scanf("%d",&y[i][j]);
    }
    printf("array y");
    for(i=0;i<3;i++)
    {   for(j=0;j<3;j++)
    {
        printf("%d",y[i][j]);
    }
    
    }

    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
        sum=sum+x[i][j]*y[j][i];
        z[i][j]=sum;
        }
    }

    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
        printf("%d",sum);
        }
    }



    


    return 0;
}