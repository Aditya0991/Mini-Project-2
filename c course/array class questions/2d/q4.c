#include<stdio.h>
int main(){
        int size,i,j;
        printf("enter size of array:");
        scanf("%d",&size);
        int ary1[size][size],ary2[size][size],x[size][size];
        printf("enter the element of array1:");
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                scanf("%d",&ary1[i][j]);
            }
        }
        printf("enter element of second array:");
        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                scanf("%d",&ary2[i][j]);
            }
        }

        
        printf("\n");


        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                x[i][j]=ary1[i][j]+ary2[i][j];
            }
        }

        for(i=0;i<size;i++){
            for(j=0;j<size;j++){
                printf("%d\t",x[i][j]);
            }
            printf("\n");
        }
        return 0;

    }
