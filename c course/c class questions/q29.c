#include<stdio.h>
int main(){
    int maths,science,hindi,english,socialscience;
    printf("enter marks of maths:\n");
    scanf("%d",&maths);
    printf("enter marks of science:\n");
    scanf("%d",&science);
    printf("enter marks of hindi:\n");
    scanf("%d",&hindi);
    printf("enter the marks of english:\n");
    scanf("%d",&english);
    printf("enter marks of social science:\n");
    scanf("%d",&socialscience);
    printf("total optained marks from 500 is %d\n",maths+science+hindi+english+socialscience);
    printf("average of above number:%d\n",(maths+science+hindi+english+socialscience)/5);
    printf("percentage of above number:%d\n",(maths+science+hindi+english+socialscience)/500*100);
    return 0;
}