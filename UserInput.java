//UserInput.java

import java . util.*;
class UserInput{
	int[] userInput(){
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		System.out.println("Enter first number:");
		numbers[0] = sc.nextInt();
		System.out.println("Enter second number:");
		numbers[1] = sc.nextInt();
		return numbers;
	}
	int fiboInput(){ //method for taking fibonnaci no of terms input	
		Scanner scan = new Scanner(System.in); 
//Scanner object to read input from the user
		int terms;	
		System.out.println("Enter the number of terms: "); 
//taking input from user
		terms = scan.nextInt();	
        return terms; // returns the value from user		
	}	

	int [] arrayInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        	int s = 0;
        	if (sc.hasNextInt()) {
            	s = sc.nextInt();
        	}

        // Initialize the array's
        // size using user input
        	int[] arr = new int[s];

        // Take user elements for the array
        	System.out.println(
            	"Enter the elements of the array: ");
        	for (int i = 0; i < s; i++) {
            	if (sc.hasNextInt()) {
                	arr[i] = sc.nextInt();
            		}
        	}

        	System.out.println(
            	"The elements of the array are: ");
        	for (int i = 0; i < s; i++) {
           	
            	System.out.print(arr[i] + " ");
        	}
		return arr;
        	
	}
	
}

