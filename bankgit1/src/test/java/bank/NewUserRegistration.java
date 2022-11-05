package bank;
import java.util.ArrayList;
import java.util.Scanner;
 
public class NewUserRegistration {

	private static String username;
	private static String dob;
	private static String phone;
	private static float balance = 0;

	static Scanner sc = new Scanner(System.in);
	public static ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();;

	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		NewUserRegistration.username = username;
	}
	public static String getDob() {
		return dob;
	}
	public static void setDob(String dob) {
		NewUserRegistration.dob = dob;
	}
	public static String getPhone() {
		return phone;
	}
	public static void setPhone(String phone) {
		NewUserRegistration.phone = phone;
	}
	public static float getBalance() {
		return balance;
	}
	public static void setBalance(float balance) {
		NewUserRegistration.balance = balance;
	}

	public static void CreateAccount() {
		System.out.println("Enter the valid username "
				+ "(username must not contain any numbers or special characters except space)");
		String user = sc.next();
		setUsername(user);
		System.out.println("Enter the date of birth (dd/mm/yyyy)");
		String d = sc.next();
		setDob(d);
		System.out.println("Enter the phone number");
		String ph = sc.next();
		setPhone(ph);
		System.out.println("Enter the initial deposit ammount");
		float bal = sc.nextFloat();
		setBalance(bal);

		updateUserDetails(); // Update the User details into array list
	}

	public static void updateUserDetails() {
		System.out.println("....Account created successfully....");
		//		Features.interaction(); // To deposit/withdraw amount 

		ArrayList<String> arr = new ArrayList<String>();
		arr.add(getUsername());
		arr.add(getDob());
		arr.add(getPhone());
		arr.add(String.valueOf(getBalance()));

		table.add(arr);

		updateAccountNull(); // set all the variables to null to implement next operation.
		//		printDetails();
	}

	public static void updateAccountNull() {
		// set all the variable to null
		setUsername(null);
		setDob(null);
		setPhone(null);
		setBalance(0);
	}

	// print all the account details
	public static void printDetails() {
		// make changes -- remove passing arguments table2 and put table.
		System.out.println("\n----------------------------------------------------------");
		System.out.println("Username\t DOB\t PhoneNumber\t Balance");
		System.out.println("----------------------------------------------------------");
		for(int i=0; i<table.size(); i++) {
			for(int j=0; j<4; j++) {
				System.out.print(table.get(i).get(j) +"\t ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------");
	}
}
