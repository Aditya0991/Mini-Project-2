#include<stdio.h>
int main(){
    int row,col,i,j;
    printf("enter the number of rows:");
    scanf("%d",&row);
    printf("enter the number of col:");
    scanf("%d",&col);
    int x[row][col];
    printf("enter the elements of array:");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&x[i][j]);
        }
    }

    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d\t",x[i][j]);
        }
        printf("\n");
    }
    return 0;
}