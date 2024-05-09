#include<stdio.h>
int main(){
    int num[5],i,total=0;
    printf("enter number 1\n");
    scanf("%d",&num[0]);

    printf("enter number 2\n");
    scanf("%d",&num[1]);

    printf("enter number 3\n");
    scanf("%d",&num[2]);

    printf("enter number 4\n");
    scanf("%d",&num[3]);

    printf("enter number 5\n");
    scanf("%d",&num[4]);

    for(i=0;i<5;i++)
    {
        if((num[i]%2)!=0)
        {
            total +=num[i];
        }
    }
    printf("sum of all odd number :%d",total);

return 0;
}