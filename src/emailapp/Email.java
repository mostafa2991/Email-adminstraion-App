package emailapp;

import java.security.SecureRandom;
import java.util.Scanner;



public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private  static int defaultpasslen=8 ;
	private int MailCapacity;
	private String companyName="elhagez";
	private String alternativemail;
	private String alternativpass;
	
	
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment () ;
		showinfo();
	}
	
	public String setDepartment () {
		Scanner sc =new Scanner(System.in);
		System.out.println("chosse your department"
		                 +"\n1 for sales"
		                 +"\n2 for Developemnt"
		                 +"\n3 for accounting");
		int i=sc.nextInt();
		if (i==1)      return "Sales";
		else if (i==2) return "Developemnt";
		else if (i==3) return "accounting";
		else   return "--------";
	}
	
	// Function to generate random alpha-numeric password of specific length
		public static String generateRandomPassword(int len){
			
			// ASCII range - alphanumeric (0-9, a-z, A-Z)
			final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

			SecureRandom random = new SecureRandom();
			StringBuilder sb = new StringBuilder();

			// each iteration of loop choose a character randomly from the given ASCII range
			// and append it to StringBuilder instance

			for (int i = 0; i < len; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

			return sb.toString();
		}

		public String getPassword() {
			return this.password;
			
		}
		public int getMailCapacity() {
			return MailCapacity;
		}
		public void setMailCapacity(int mailCapacity) {
			MailCapacity = mailCapacity;
		}

		

		public void setAlternativemail(String alternativemail) {
			this.alternativemail = alternativemail;
		}


		public void setAlternativpass(String alternativpass) {
			this.alternativpass = alternativpass;
		}

	public void showinfo(){
		System.out.println(this.firstName+"."+this.lastName
		          +"@"+this.department+"."+this.companyName+".com"
		          +"\n and your password is : "+generateRandomPassword(defaultpasslen));
		
	}
		
		
		
		
		
		
		
		
	
}
