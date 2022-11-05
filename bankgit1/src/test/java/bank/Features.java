package bank;

import java.util.Scanner;

public class Features {
	static Scanner sc = new Scanner(System.in);
	private static String username;
	private static float balance = 0;

	public static String getUsername() {
		return username;
	}
	public static void setUsername(String Username) {
		Features.username = Username;
	}
	public static float getBalance() {
		return balance;
	}
	public static void setBalance(float balance) {
		Features.balance = balance;
		
	}

	public static void transactions() {
		boolean flag = true;
		//while loop until exit..
		while(flag) {
			System.out.println("Please select the below options\n"
					+ "1 - Deposite money\n"
					+ "2 - Withdraw money\n"
					+ "3 - Account details\n"
					+ "4 - exit");

			int option2 = sc.nextInt();
			sc.nextLine();
			switch (option2) {
			case 1: Features.moneyDeposit();
			break;
			case 2: Features.moneyWithdraw();
			break;
			case 3: Features.printCurrentUserDetails(getUsername());
			break;
			case 4: flag = false;
			break;
			}
		}
	}

	// method 2 : deposit money in the account
	public static void moneyDeposit() {
		System.out.println("Enter the deposit amount : ");
		float bal = getBalance() + sc.nextFloat();
		sc.nextLine();
		setBalance(bal);
		System.out.println("Money successfully deposited.\n"
				+ "Your account current balance is : "+ getBalance());
		updateUserDetails(username, getBalance()); // set balance in array list
	}

	// method 3 : money withdraw
	public static void moneyWithdraw() {
		System.out.println("Enter the amount for withdrawal");
		float amount = sc.nextFloat();
		sc.nextLine();
		if(amount > getBalance()) {
			System.out.println("You Don't have enough balance.");
		}else {
			setBalance(getBalance() - amount);
			System.out.println("Money withdrawal successful."
					+ "Your account current balance is : "+ getBalance());
//			NewUserRegistration.setBalance(getBalance()); // set balance in array list
			updateUserDetails(username, getBalance());
		}
	}

	// print all the account details
	public static void printCurrentUserDetails(String user) {
		boolean flag = false;
		// make changes -- Only print current user details.
		System.out.println("\n----------------------------------------------------------");
		System.out.println("Username\t DOB\t PhoneNumber\t Balance");
		System.out.println("----------------------------------------------------------");
		for(int i=0; i < NewUserRegistration.table.size(); i++) {
			if (user.equals(NewUserRegistration.table.get(i).get(0))) {
				
				flag = true;
				for(int j=0; j<4; j++) {
					System.out.print(NewUserRegistration.table.get(i).get(j) +"\t ");
				}
				System.out.println();
			}
		}
		if (flag == false) System.out.println("InValid User..");
		System.out.println("----------------------------------------------------------");

	}

	public static void existingUser() {
		System.out.println("Enter the Username: ");
		String user = sc.nextLine();
		setUsername(user);

		// verify the account
		if (accountVerification(user) == true){
			// Interaction method functionality
			transactions();
		}
	}

	public static boolean accountVerification(String user) {
		boolean flaag = false;
		for(int i=0; i < NewUserRegistration.table.size(); i++) {
			if (NewUserRegistration.table.get(i).get(0).equals(user)){
				setBalance(Float.parseFloat(NewUserRegistration.table.get(i).get(3)));
				flaag = true;
			}
		}
		if (flaag == true) System.out.println("Valid User..");
		else System.out.println("Invalid User");
		return flaag;
	}
	
	public static void updateUserDetails(String user,float bal) {
		for(int i=0; i < NewUserRegistration.table.size(); i++) {
			if (NewUserRegistration.table.get(i).get(0).equals(user)){
//				setBalance(Float.parseFloat(NewUserRegistration.table.set(i).get(3)));
				NewUserRegistration.table.get(i).set(3,String.valueOf(bal));
			}
		}
	}


}
