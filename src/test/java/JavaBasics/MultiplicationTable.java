package JavaBasics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number for which the table is to be printed

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Print the multiplication table using a while loop
        int i = 1;
        System.out.println(number + "rd Table:");
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;  // Increment the counter
        }

        // Close the scanner
        sc.close();
    }
}

