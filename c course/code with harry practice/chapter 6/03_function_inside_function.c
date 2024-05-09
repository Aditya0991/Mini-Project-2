#include<stdio.h>
void GM()
{
    printf("good morning");
    GA();
    GN();
}

void GA()
{
    printf("good afternoon\n");
}

void GN()
{
    printf("good night\n");
}
int main()
{
    printf("In morning\n");
    GM();

    return 0;
}