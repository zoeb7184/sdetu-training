package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
       BankAccount acc1 = new BankAccount();
		
      // acc1.name = "Zoeb Khan";
       //With Encapsulation : public API methods
       acc1.setName("Zoeb Khan");
       System.out.println(acc1.getName());
       acc1.setSsn("36283691");
       System.out.println("SSN: " + acc1.getSsn());
       
       acc1.accountNumber = "26183823";
       acc1.balance = 10000;
       acc1.setRate();
       acc1.increaseRate();
		
	    acc1.deposite(1500);
	
	    // Polymorphism through over loading	   
	    System.out.println(acc1.toString());  
		
	    // Polymorphism through over loading
       BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "26183823";

       BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "26183823";
		
		/*
        acc3.checkBalance();
        
        
       // Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Faisal";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
	}

}
