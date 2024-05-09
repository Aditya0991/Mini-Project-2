#include<stdio.h>
int main(){
    int row,col;
    printf("enter the size of row:");
    scanf("%d",&row);
    printf("enter the size of col:");
    scanf("%d",&col);
    int x[row][col],i,j;
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("enter the element %d*%d of array:",i+1,j+1);
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d  ",x[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}