//Java Lab Assignment 01
//Srishti Tripathi
//23070126131
//AIML B3
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Scanner object to read option from the user
        Calculator cal = new Calculator(); // Object to call methods from Calculator class

        while (true) { // Infinite loop until exit is selected
            System.out.println("\nSelect what to do:");
            System.out.println("1) Calculator");
            System.out.println("2) Fibonacci");
            System.out.println("3) Array (sum and average)");
            System.out.println("4) Exit");

            int option = scan.nextInt(); // Taking user input; 1, 2, 3, or 4 is expected

            switch (option) {
                case 1: // Calculator
                    cal.tkinput(); // Read numbers for calculation

                    System.out.println("\nSelect what to do:");
                    System.out.println("a) Addition");
                    System.out.println("b) Subtraction");
                    System.out.println("c) Multiplication");
                    System.out.println("d) Division");
                    System.out.println("e) Go Back");

                    String method = scan.next(); // Method taken from user's input
                    switch (method) {
                        case "a": // Addition
                            System.out.println("\nSum is: " + cal.addition());
                            break;

                        case "b": // Subtraction
                            System.out.println("\nDifference is: " + cal.subtraction());
                            break;

                        case "c": // Multiplication
                            System.out.println("\nMultiplication is: " + cal.multiplication());
                            break;

                        case "d": // Division
                            System.out.println("\nDivision is: " + cal.division());
                            break;

                        case "e": // Go Back
                            break;

                        default:
                            System.out.println("\nInvalid Input");
                            break;
                    }
                    break;

                case 2: // Fibonacci
                    cal.fibonacci(); // Calling the method fibonacci()
                    break;

                case 3: // Array sum and average
                    System.out.println("Enter the number of elements in the array: "); // Taking size of the array
                    int n = scan.nextInt();
                    cal.sumAverageArr(n);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program!");
                    return;

                default:
                    System.out.println("\nPlease Enter a Valid Option");
                    break;
            }
        }
    }
}
