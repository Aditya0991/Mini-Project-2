#include<stdio.h>
int main(){
    int row,col,i,j,sum=0;
    printf("enter the row and col:");
    scanf("%d %d",&row,&col);
    int x[row][col];
    printf("enter element of array:\n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            
            // for 2*2 matrix
            if(i+j==1){  
                sum+=x[i][j];
            }
            
        }
        
    }
    printf("sum:%d",sum);
    return 0;
}