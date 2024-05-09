// for sq matrix-
#include<stdio.h>
int main(){
    int row,col,i,j;
    printf("enter the row and col:");
    scanf("%d %d",&row,&col);
    int x[row][col];
    printf("enter the element of array:");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&x[i][j]);
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            if((i+j)<row){
                printf("%d  ",x[i][j]);
            }
            
        }
        printf("\n");
    }
    return 0;
}