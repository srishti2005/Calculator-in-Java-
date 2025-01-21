
//calculator.java
class Calculator{
	int[] numbers;
	void tkinput(){
		UserInput input = new UserInput();
		numbers = input.userInput();
	
	}
	
	int[] arr;
	void arrinput(){
		UserInput input = new UserInput();
		arr = input.arrayInput();
	
	}

	
	int addition(){
		int sum = numbers[0] + numbers[1];
		return sum;
	}
	
	int subtraction(){
		int diff = numbers[0] - numbers[1];
		return diff;
	}

	int multiplication(){
		int mul = numbers[0] * numbers[1];
		return mul;
	}
	
	int division(){
		int div =  numbers[0] / numbers[1];
		return div;
	}

	void fibonnaci(){ //new method for fibonnaci code			
		UserInput input = new UserInput(); //calls UserInput method
		int terms; //to store no of terms
		
		terms = input.fiboInput(); //calling fiboInput() method from UserInput class
		
		// terms to store 1st and 2nd terms
        int first = 0; 
		int second = 1;
			        
        for (int i = 1; i <= terms; i++) {  //for loop runs no.of.terms times
            System.out.print(first + " ");
            
            // Update the values for the next Fibonacci term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
		}
	}	
}
