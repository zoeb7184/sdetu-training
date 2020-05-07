package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("26365153", 1000.50);
		BankAccount acc2 = new BankAccount("82662428", 2000.50);
		BankAccount acc3 = new BankAccount("75192519", 3000.50);
		 
		acc1.setName("Zoeb Khan");
		   System.out.println(acc1.getName());
		   acc1.makeDeposite(500);
		   acc1.makeDeposite(600);
		   acc1.payBill(1000);
		   acc1.accrue();
		   System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	// Properties of bank account
	private static int iD = 1000;   // Internal ID
	private String accountNumber;   // ID + random 2-digit number + first 2-digit of SSN 
	private static final String routingNumber = "40054037";
	private String name;
	private String SSN;
    private double balance;
    
    // Constructor
    public BankAccount(String SSN, double intDeposite) {
        balance = intDeposite;
    	this.SSN = SSN;
    	iD++;
    	setAccountNumber();
    }
    
    private void setAccountNumber() {
    	int random = (int) (Math.random() * 100);
    	
    	accountNumber = iD + "" + random + SSN.substring(0, 2);
    	System.out.println("Your Account Number: " + accountNumber);
    }
    
    public void setName(String name) {
    	this.name = name;
    	}
    public String getName() {
    	return name;
    }
    
    public void  payBill(double amount) {
    	balance = balance-amount;
    	System.out.println("Pay Bill:" + amount);
    	showBalance();
    }
    
    public void makeDeposite(double amount) {
    	balance = balance+amount;
    	System.out.println("Make Deposite:" + amount);
    	showBalance();
    }
    
    public void showBalance() {
    	System.out.println("BALANCE: " + balance);
    }

	@Override
	public void accrue() {
        balance = balance * (1 + rate/100);	
        showBalance();
	}
 
	@Override 
    public String toString() {
		return "[Name: " + name +  "]\n[Accoun Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	
}
