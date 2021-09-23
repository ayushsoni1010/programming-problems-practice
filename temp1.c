#include <stdio.h>

int main()
{
    printf("Enter the first number:");
    int a;
    scanf("%d", &a);

    printf("Enter the second number:");
    int b;
    scanf("%d", &b);
    //ADDITION
    int c;
    c = a + b;
    printf("The value of %d and %d is %d", a, b, c);

    //MULTIPLICATION
    int d;
    d = a * b;
    printf("The value of %d and %d is %d", a, b, d);

    return 0;
}