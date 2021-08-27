// Substract of Two numbers

#include <stdio.h>
int main(){

    // let num1 and num2 
    int num1;
    int num2;
    
    // let substract  
    int substract;
    
    // Take input from user
    printf("Enter num1 : ");
    scanf("%d",&num1);

    printf("Enter num2 : ");
    scanf("%d",&num2);

    // Here substract is intialised to num1 + num2
    substract = num1 - num2;

    // Printing the substract of two numbers
    printf("Substract of Two numbers : %d",substract);
    
    return 0;
}
