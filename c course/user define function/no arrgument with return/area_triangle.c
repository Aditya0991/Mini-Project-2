#include<stdio.h>
#include<math.h>
float tri()
{
    float a,b,c,s,area;
    printf("enter the value of a,b and c:");
    scanf("%f %f %f",&a,&b,&c);
    s=(a+b+c)/2;
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    
    return area;
}
int main(){
    float tri1=tri();
    printf("area of triangle:%f",tri1);
    return 0;
}