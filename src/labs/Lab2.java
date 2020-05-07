package labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stu1 = new Student("Zoeb","253626263");
		Student stu2 = new Student("Faisal","24238389");
		Student stu3 = new Student("Zahid","04628485");
		
		stu1.enroll("Maths151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");

		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.payTuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}
    
   class Student {
	   // Properties
	   private static int iD=1000;
	   private String userId;
	   private String name;
	   private String SSN;
	   private String email;
	   private String phone;
	   private String city;
	   private String state;
	   private String courses = ""; 
	   private static final int costOfcourses = 800;
	   private int balance;
	   
	   public Student(String name, String SSN) {
		   iD++;
		   this.name = name;
		   this.SSN = SSN;
		   setUserID();
		   setEmail();
	   }

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	
    public void setState(String state) {
	 this.state = state;
	}
    
	   private void setEmail() {
		  email = name.toLowerCase()+ "." + iD + "@sdetuniversity.com";
		  System.out.println("Your Email:" + email);
	   }
	   public String getEmail() {
		   return email;
	   }
	   private void setUserID() {
		   int max = 9000;
		   int min = 1000;
		   int randNum = (int) (Math.random() * ((max - min)));
		   randNum = randNum + min;
		   userId = iD + "" +  randNum + SSN.substring(6);
		   System.out.println("Your User ID: " + userId);
	  }
	   
	   public void enroll(String course) { 
		   this.courses = this.courses + "\n" + course;
		   balance = balance + costOfcourses;
	   }
	   
	   public void payTuition(int amount) {
		   System.out.println("Payment: $" + amount);
		   balance = balance - amount; 
	   }
	   
	   public void checkBalance() {
		   System.out.println("Balance: $" + balance);
	   }
	   
	   public void showCourses() {
		   System.out.println(courses);
	   }
	   
	   public String toString() {
		 return "[NAME: " + name + " ]\n[COURSES: " + courses + "]\nBALANCE: " + balance + "]";
	   }
	   
   }