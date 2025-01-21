class Calculator {
    int[] numbers;

    // Method to take input for two numbers
    void tkinput() {
        UserInput input = new UserInput();
        numbers = input.userInput();
    }

    // Method to perform addition
    int addition() {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction
    int subtraction() {
        return numbers[0] - numbers[1];
    }

    // Method to perform multiplication
    int multiplication() {
        return numbers[0] * numbers[1];
    }

    // Method to perform division
    int division() {
        try {
            return numbers[0] / numbers[1];
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 to indicate error
        }
    }

    // Method to generate a Fibonacci sequence
    void fibonacci() {
        UserInput input = new UserInput();
        int terms = input.fiboInput(); // Number of terms in the sequence

        int first = 0, second = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println(); // Add a newline for better readability
    }

    // Method to calculate sum and average of an array
    void sumAverageArr(int size) {
        UserInput input = new UserInput(); // Calls UserInput method
        int[] arr = input.arrayInput(size); // Correctly passes size to arrayInput method
        int total = 0;

        for (int i = 0; i < size; i++) { // Calculate the total by adding all numbers in the array
            total += arr[i];
        }
        double average = (double) total / size; // Typecast into double to get decimal values

        System.out.println("The Sum of Elements of the Array is: " + total);
        System.out.println("The Average of Elements in the Array is: " + average);
    }
}
