#include <stdio.h>
int main()
{
int n, first,last;

printf("Enter the number: ");
scanf("%d", &n);
last =n%10;
while(n>=10)
{
n=n/10;
}
first = n ;
printf("First Digit = %d and Last digit = %d",first, last);
return 0;
}