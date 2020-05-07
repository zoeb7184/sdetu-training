package basic;

public class Lab1 {

	public static void main(String[] args) {
		// Write a function that take a value N and return the sum of 1 to n
		System.out.println(sum(4));
		
		//Write
		System.out.println("factorial:" +fact(5));
		
		//write
		int[] numbers = {1, -3, 1, 345, -549, 74};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
		
	}
	
	 public static int  findAvg(int[] arr) {
		 //
		 int sum=0;
		 for (int n=0; n<arr.length; n++) {
			 sum =  sum + arr[n];
		 }
		 System.out.println("Sum: " + sum);
		 return sum;
	 }
	
	 public static int findMin(int[] arr) {
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	    	if (arr[i] < min) {
	    		min = arr[i];
	    	}
	    }
	    return min;
	 }
	 
	 public static int findMax(int[] arr) {
		    int max = arr[0];
		    for (int i = 0; i < arr.length; i++) {
		    	if (arr[i] > max) {
		    		max = arr[i];
		    	}
		    }
		    return max;
		 }
	 
     public static int sum(int n) {
    	 int sum = 0;
    	 for (int i = 1; i <=n; i++) {
    		 System.out.print(sum + " + " + i);
    		 sum = sum + i;
    			 System.out.println(" = " + sum);
    		 
    	 }
    	 return n;
    	}
     public static int fact(int n) {
    	 if (n == 0) {
    		 return 1;
    	 }
    	 System.out.println(n);
    	 return fact(n-1) *n;
     }
    
    	
}
