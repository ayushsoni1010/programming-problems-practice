// Division of Two numbers

#include <stdio.h>
int main(){

    // let num1 and num2 
    int num1;
    int num2;
    
    // let division  
    int division;
    
    // Take input from user
    printf("Enter num1 : ");
    scanf("%d",&num1);

    printf("Enter num2 : ");
    scanf("%d",&num2);

    // Here division is intialised to num1 + num2
    division = num1 / num2;

    // Printing the division of two numbers
    printf("Division of Two numbers : %d",division);
    
    return 0;
}
