import java.util.Scanner;

class UserInput {
    private Scanner sc = new Scanner(System.in); // Single Scanner object for all inputs

    // Method to take two integers as input
    int[] userInput() {
        int[] numbers = new int[2];
        System.out.println("Enter first number:");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            sc.next(); // Clear invalid input
        }
        numbers[0] = sc.nextInt();

        System.out.println("Enter second number:");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            sc.next(); // Clear invalid input
        }
        numbers[1] = sc.nextInt();

        return numbers;
    }

    // Method to take input for Fibonacci terms
    int fiboInput() {
        System.out.println("Enter the number of terms: ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            sc.next(); // Clear invalid input
        }
        int terms = sc.nextInt();
        if (terms <= 0) {
            System.out.println("Number of terms must be positive. Defaulting to 1.");
            terms = 1;
        }
        return terms;
    }

    // Method to take an array input from the user
    int[] arrayInput(int size) {
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next(); // Clear invalid input
            }
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
