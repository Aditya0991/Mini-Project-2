#include<stdio.h>
int main(){
    int row,col,sum=0;
    printf("enter the row:");
    scanf("%d",&row);
    printf("enter the col:");
    scanf("%d",&col);
    int x[row][col],i,j;
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("element of array");
            scanf("%d",&x[i][j]); 
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d\t",x[i][j]);
            sum+=x[j][i];
        }
        printf("col sum:%d\n",sum);
        sum =0;
    }
    
    return 0;
}