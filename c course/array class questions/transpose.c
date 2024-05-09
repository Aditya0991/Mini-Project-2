#include<stdio.h>
int main(){
    int row ,col,i,j,sum=0;
    printf("enter row and col:");
    scanf("%d %d",&row,&col);
    int x[row][col];
    printf("enter element of array:");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            
            printf("%d\t",x[j][i]);
        }
        printf("\n");
    }
    return 0;
}