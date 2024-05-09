#include<stdio.h>
int main()
{
    int num[5];
    int i,positive=0,negative=0,avg;
    printf("enter number 1:");
    scanf("%d",&num[0]);

    printf("enter number 2:");
    scanf("%d",&num[1]);

    printf("enter number 3:");
    scanf("%d",&num[2]);

    printf("enter number 4:");
    scanf("%d",&num[3]);

    printf("enter number 5:");
    scanf("%d",&num[4]);

    for(i=0;i<5;i++)
    {
        if(num[i]>0)
        {
            positive++;
            
        }
        else if(num[i]<0)
        {
            negative++;
        }
       
    }
    avg=positive/
    printf("positive number:%d\n",positive);
    printf("negative number:%d",negative);
    return 0;
}