#include<stdio.h>
int main()
{ int row,col,i;
  printf("Enter the row size:");
  
  scanf("%d",&row);
  for(col=1;col<=row;col++)
  {
   for(i=row;i>=col;i--)
    printf("*");
   printf("\n");
  }
}