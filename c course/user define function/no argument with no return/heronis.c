#include<stdio.h>
#include<math.h>
float tri()
{
    float a,b,c,s,area;
    printf("enter the value of a,b and c:");
    scanf("%f %f %f",&a,&b,&c);
    s=(a+b+c)/2;
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    printf("area of triangle:%f",area);
    return area;
}
int main(){
    tri();
    return 0;
}