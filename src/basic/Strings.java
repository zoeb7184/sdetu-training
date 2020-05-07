package basic;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Rings";
		bookTitle = "The Lord of the Rings";
	
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}

		String browser = "Chrome";
		// (browser == "chrome");
		if (browser.equalsIgnoreCase("chrome"));{
		  System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "9894123930";
		
		System.out.println(" There are " + SSN.length() + " digit in your SSN1");
		
		// Print the initials plus last 4 digit of SSN
	    System.out.print(firstName.substring(0, 1));
	    System.out.print(lastName.substring(0, 4));
	    System.out.print(SSN.substring(5));
	}

}
