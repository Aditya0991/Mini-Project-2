#include<stdio.h>
int main(){
    int radius;
    float pi =3.14;
    printf("enter the radius");
    scanf("%d",&radius);
    printf("area of circle:%f\n",pi*radius*radius);
    printf("circumfirence of circle:%f",2*pi*radius);
    return 0;
}