#include<stdio.h>
int main()
{
int size,i,j,sum=0;
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
        if(i==j){
            sum+=x[i][j];
        }
    }
    
}
printf("sum diagonal:%d",sum);

return 0;
}