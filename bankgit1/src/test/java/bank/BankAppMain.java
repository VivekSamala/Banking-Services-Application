package bank;
import java.util.Scanner;

public class BankAppMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("********Welcome to Captain Banking Services********\n");
		// while loop until exit.
		while(true) {
			System.out.println(
					  "1 - Are you a new user and want to create an account\n"
					+ "2 - Existing user\n"
					+ "3 - Exit");

			int option1 = sc.nextInt();
			sc.nextLine();
			if (option1 == 1) {
				NewUserRegistration.CreateAccount(); // It will create the account and update the user in array list
				NewUserRegistration.printDetails();
			}
			else if (option1 == 2) {
				//create a method which can take the user name and continue to his account.
				Features.existingUser();
			}
			else {
				System.out.println("********Thanks for using our services********");
				break;// method - exit (break in while loop)
			} 
		}
	}

}
