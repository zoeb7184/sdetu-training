package oop;

public class BankAccount implements IRate {
     // Define Variable
	
	// static >> belongs to the CLASS & not the object instance
	// final >> CONSTANT ( often static final )
	String accountNumber;
	private static final String routingNumber = "122523";
	
	// Instance name
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions unique method
	 // 1. They are used to define / setup / initialize properties of an object
	 // 2. Constructor are IMPLICITY called upon instantiation
	 // 3. The same name as the class itself
	 // 4. Constructors have NO return type
	
   BankAccount(){
	 System.out.println("NEW ACCOUNT CREATED");  
   }
   
     // Overloading: all same method with different argument
     BankAccount(String accountType) {
    	 System.out.println("NEW ACCOUNT: " + accountType);
     }
     
     BankAccount(String accountType, double initDeposite){
    	 
    	 // initDeposite, accountType, Msg are all local variables
    	 System.out.println("NEW ACCOUNT: " + accountType);
    	 System.out.println("INITIAL DEPOSITE OF: $ " + initDeposite);
    	 String Msg = null;
    	 if (initDeposite < 1000) {
    	     Msg = "ERROR: Minimum deposite must be at least $1,000";
    	 }
    	 else {
    		 Msg = "Thanks for your initial deposite of: $" + initDeposite;
    		 
    	 }
    	     System.out.println(Msg);
    	     balance = initDeposite;
     }
     

     //Getters / Setters  
     
     // name 
     
     // Allow the user to define the name 
     public void setName(String name) {
    	this.name ="Mr." + name;    	 
     }
     public String getName() {
    	 return name;
     }
    
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Interface methods
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}
	
	
	
	
	
	
	
	// Define methods
	public void deposite(double amount) {
		balance = balance + amount;
		showActivity("DEPOSITE");
	}

	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	//Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSCTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	private void checkbalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return " [NAME: " + name +  ". ACCOUNT# " + accountNumber +  ". ROUTING #" + routingNumber +". BALANCE: $" + balance + " ]";

	}
	
}
