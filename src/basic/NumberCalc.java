package basic;

public class NumberCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumnbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and "  + numB + " is " + product);
	}
	
	 static void printName() {
		 System.out.println("My Name is Zoeb");
	 }
	
	 static void addNumnbers(int numberA, int numberB ) {
		//This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
		
	} 
	 
	static int multiplyNumbers(int valueA, int valueB) {
     	int product = valueA * valueB;
     	addNumnbers(product + 50 ,product);
	    return product;
	}
	
}


