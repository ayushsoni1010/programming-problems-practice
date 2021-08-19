// Sum of Two numbers

#include <stdio.h>
int main(){

    // let num1 and num2 
    int num1;
    int num2;
    
    // let sum  
    int sum;
    
    // Take input from user
    printf("Enter num1 : ");
    scanf("%d",&num1);

    printf("Enter num2 : ");
    scanf("%d",&num2);

    // Here Sum is intialised to num1 + num2
    sum = num1 + num2;

    // Printing the sum of two numbers
    printf("Sum of Two numbers : %d",sum);
    
    return 0;
}
