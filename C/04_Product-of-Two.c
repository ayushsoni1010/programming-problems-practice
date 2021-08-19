// product of Two numbers

#include <stdio.h>
int main(){

    // let num1 and num2 
    int num1;
    int num2;
    
    // let product  
    int product;
    
    // Take input from user
    printf("Enter num1 : ");
    scanf("%d",&num1);

    printf("Enter num2 : ");
    scanf("%d",&num2);

    // Here product is intialised to num1 + num2
    product = num1 * num2;

    // Printing the product of two numbers
    printf("Product of Two numbers : %d",product);
    
    return 0;
}
