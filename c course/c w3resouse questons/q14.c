#include<stdio.h>
int main(){
    float km , fuel , milage;
    printf("enter the distance travled in km:");
    scanf("%f",&km);
    printf("enter the fule consumed in liters:");
    scanf("%f",&fuel);
    milage=km/fuel;
    printf("milage : %fkm/l",milage);
    return 0;
}