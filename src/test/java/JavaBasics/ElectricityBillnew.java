package JavaBasics;

import java.util.Scanner;

public class ElectricityBillnew {

    public static void main(String[] args) {

        // Create scanner object for taking input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of units consumed

        System.out.println("Enter the number of units consumed: ");

        double units = sc.nextDouble();

        // Initialize the bill variable

        double bill = 0.0;

        // Calculate bill based on unit slabs

        if (units <= 50) {
            bill = units * 0.50;

        } else if (units <= 150) {
            bill = units* 0.75;

        } else if (units <= 250) {
            bill = units * 1.20;

        } else if (units >= 250) {
            bill = units * 1.50;

        } else {
            bill = 50 * 0.50 + 150 * 0.75 + 250 * 1.20 + 250 * 1.50;
        }

        // Adding 20% surcharge
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        // Output the total bill
        System.out.println("Total electricity bill is Rs. " + totalBill);
    }
}

