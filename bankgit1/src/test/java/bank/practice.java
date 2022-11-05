//package bank;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class practice {
//	static Scanner sc = new Scanner(System.in);
//	private static String username;
//	private static String dob;
//	private static String phone;
//	private static float balance = 0;
//	
//	private static ArrayList<ArrayList<String>> table;
//	
//	public static String getUsername() {
//		return username;
//	}
//	public static void setUsername(String username) {
//		Features.username = username;
//	}
//	public static String getDob() {
//		return dob;
//	}
//	public static void setDob(String dob) {
//		Features.dob = dob;
//	}
//	public static String getPhone() {
//		return phone;
//	}
//	public static void setPhone(String phone) {
//		Features.phone = phone;
//	}
//	public static float getBalance() {
//		return balance;
//	}
//	public static void setBalance(float balance) {
//		Features.balance = balance;
//	}
//	
//	public static void CreateAccount() {
//			System.out.println("Enter the valid username "
//					+ "(username must not contain any numbers or special characters except space)");
//			username = sc.nextLine();
//			setUsername(username);
//			System.out.println("Enter the date of birth (dd/mm/yyyy)");
//			dob = sc.next();
//			setDob(dob);
//			System.out.println("Enter the phone number");
//			phone = sc.next();
//			setPhone(phone);
//		}
//	
//	public static void interaction() {
//		boolean flag = true;
//		//while loop until exit..
//		while(flag) {
//			System.out.println("Please select the below options\n"
//					+ "1 - Deposite money\n"
//					+ "2 - Withdraw money\n"
//					+ "3 - Account details\n"
//					+ "4 - exit");
//			
//			int option2 = sc.nextInt();
//			sc.nextLine();
//			switch (option2) {
//			case 1: Features.moneyDeposit();
//			break;
//			case 2: Features.moneyWithdraw();
//			break;
//			case 3: Features.accountDetails();
//			break;
//			case 4: flag = false;
//			break;
//			}
//		}
//	}
//	
//	// method 2 : deposit money in the account
//	public static void moneyDeposit() {
//		System.out.println("Enter the deposit amount : ");
//		float bal = getBalance() + sc.nextFloat();
//		sc.nextLine();
//		setBalance(bal);
//		System.out.println("Money successfully deposited."
//				+ "Your account current balance is : "+ getBalance());
//	}
//	
//	// method 3 : money withdraw
//	public static void moneyWithdraw() {
//		System.out.println("Enter the amount for withdrawal");
//		float amount = sc.nextFloat();
//		sc.nextLine();
//		if(amount > getBalance()) {
//			System.out.println("You Don't have enough balance.");
//		}else {
//			setBalance(getBalance() - amount);
//			System.out.println("Money withdrawal successful."
//					+ "Your account current balance is : "+ getBalance());
//		}
//	}
//	
//	public static ArrayList<ArrayList<String>> accountDetails() {
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add(getUsername());
//		arr.add(getDob());
//		arr.add(getPhone());
//		arr.add(String.valueOf(getBalance()));
//		
//		table = new ArrayList<ArrayList<String>>();
//		table.add(arr);
//		
//		printDetails();
//		return table;
//	}
//	// print all the account details
//	public static void printDetails() {
//		// make changes -- remove passing arguments table2 and put table.
//		System.out.println("\n----------------------------------------------------------");
//		System.out.println("Username\tDOB\t\tPhoneNumber\tBalance");
//		System.out.println("----------------------------------------------------------");
//		for(int i=0; i<table.size(); i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(table.get(i).get(j) +"\t ");
//			}
//			System.out.println();
//		}
//		System.out.println("----------------------------------------------------------");
//
//	}
//	
//	
//	public static void existingUser() {
//		System.out.println("Enter the Username: ");
//		String user = sc.nextLine();
//		
//		// verify the account
//		if (accountVerification(user) == true){
//			// Interaction method functionality
//			boolean flag = true;
//			while(flag) { //while loop until exit..
//				System.out.println("Please select the below options\n"
//						+ "1 - Deposite money\n"
//						+ "2 - Withdraw money\n"
//						+ "3 - Account details\n"
//						+ "4 - exit");
//				int option2 = sc.nextInt();
//				sc.nextLine();
//				switch (option2) {
//				case 1: Features.moneyDeposit();
//				break;
//				case 2: Features.moneyWithdraw();
//				break;
//				case 3: Features.accountDetails();
//				break;
//				case 4: flag = false;
//				break;
//				}
//			}
//		}
//	}
//	
//	public static boolean accountVerification(String user) {
//		boolean flaag = false;
//		for(int i=0; i<table.size(); i++) {
//			if (table.get(i).get(0).equals(user)){
//				
//				//Set all the variables to current user details.
//				setUsername(table.get(i).get(0));
//				setDob(table.get(i).get(1));
//				setPhone(table.get(i).get(2));
//				setBalance(Float.parseFloat(table.get(i).get(3)));
//				flaag = true;
//			}
//		}
//		if (flaag == true) System.out.println("Valid User..");
//		else System.out.println("Invalid User");
//		return flaag;
//	}
//	public static void updateAccountNull() {
//		// set all the variable to null
//		setUsername(null);
//		setDob(null);
//		setPhone(null);
//		setBalance(0);
//		
//	}
//}
