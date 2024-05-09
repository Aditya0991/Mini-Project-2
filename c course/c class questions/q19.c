#include<stdio.h>
int main(){
    int radius;
    float pi=3.14;
    printf("enter the radius of circle:\n"),
    scanf("%d",&radius);
    printf("the diameter of circle:%d\n",2*radius);
    printf("the circumference of circle:%f\n",2*pi*radius);
    printf("the area of circle:%f\n",pi*radius*radius);
    return 0;
}