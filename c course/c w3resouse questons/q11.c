#include<stdio.h>
int main(){
    double weight1,item1,weight2,item2,result;
    printf("enter weight1:");
    scanf("%lf",&weight1);

    printf("enter item1:");
    scanf("%lf",&item1);

    
    printf("enter weight2:");
    scanf("%lf",&weight2);
    
    printf("enter item2:");
    scanf("%lf",&item2);

    result = ((weight1*item1)+(weight2*item2))/item1+item2;
    printf("average : %f",result);
    return 0;

}