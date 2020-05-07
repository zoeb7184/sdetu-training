package basic;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestion of what to wear based on the weather (temperature)
		
		int temperature = 41;
		String sunCondition ="Sunny";
		
		if (temperature > 80 )  {
			System.out.println("It's pleasent. Wear shorts and t-shirts");
			System.out.println("Make sure ti take your sun glasses");
		}
		else if ((temperature > 60) && ( sunCondition == "Sunny")) {
			System.out.println("It's little cooler, Perhaps wear long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("look's a cold day. Bring a sweater");
		}
		System.out.println("The program is ending");
	}
}
