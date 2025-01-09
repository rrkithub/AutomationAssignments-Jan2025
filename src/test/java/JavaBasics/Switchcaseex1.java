package JavaBasics;

import java.util.Scanner;

public class Switchcaseex1 {

    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter number between 1 to 7");
       int weeknumber =sc.nextInt();
        switch (weeknumber)

        {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
                case 4 : System.out.println("Thursady");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default: System.out.println("Invalid weeknumber");
            break;
        }

    }
}
