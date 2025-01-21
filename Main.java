// Main.java

class Main{
	public static void main(String args[]){
		Calculator cal = new Calculator();
		cal.tkinput();
		System.out.println("Sum is:" +cal.addition());
		
		System.out.println("Diff is:" +cal.subtraction());
		System.out.println("Product is:" +cal.multiplication());
		System.out.println("Quotient is:" +cal.division());

	}
}