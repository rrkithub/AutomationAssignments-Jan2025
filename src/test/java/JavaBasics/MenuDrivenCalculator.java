package JavaBasics;

import java.util.Scanner;

public class MenuDrivenCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Displaying the menu for understanding  to the user

        System.out.println("Menu:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Please select an option (1/2/3/4): ");

        // Read the user's choice
        int choice = sc.nextInt();

        // Asking  the user to enter two integers for the operation
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        //  using Switch statement

        switch (choice) {
            case 1: // Addition
                System.out.println("The sum is: " + (number1 + number2));
                break;
            case 2: // Subtraction
                System.out.println("The difference is: " + (number1 - number2));
                break;
            case 3: // Multiplication
                System.out.println("The product is: " + (number1 * number2));
                break;
            case 4: // Division
                // Checking if the second number is not zero to avoid division by zero
                if (number2 != 0) {
                    System.out.println("The division result is: " + (number1 / (double) number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        // Closing the scanner
        sc.close();
    }
}






