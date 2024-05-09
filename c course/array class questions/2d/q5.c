#include<stdio.h>
int main()
{
int size,i,j;
printf("enter the size of array:");
scanf("%d",&size);
int x[size][size];
printf("enter the element of array:");
for(i=0;i<size;i++){
    for(j=0;j<size;j++){
        scanf("%d",&x[i][j]);
    }
}

for(i=0;i<size;i++)
{
    for(j=0;j<size;j++)
    {
        printf("%d ",x[j][i]);
    }
    printf("\n");
}

return 0;
}