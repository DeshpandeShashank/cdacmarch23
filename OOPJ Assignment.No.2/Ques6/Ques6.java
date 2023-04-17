package assignment2;

import java.util.Random;
import java.util.Scanner;

class BankAccount {
	private String name;
	private String address;
	private String aadharNum;
	private String pin;
	private float balance;
	private long accountNo;

	// getter setter
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setAccount() {
		Random random = new Random();
		accountNo = random.nextInt(999999999);
	}

	public long getAccount() {
		return accountNo;
	}

	// Create account function
	public void openAcc() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Customer Name: ");
		setName(sc.nextLine());
		System.out.println("Enter the Address: ");
		setAddress(sc.nextLine());
		System.out.println("Enter your Aadhar Number: ");
		setAadharNum(sc.nextLine());
		System.out.println("Enter the Pin: ");
		setPin(sc.nextLine());
		setAccount();
		System.out.println("Your Account Inforamtion is: " + toString());
	}

	@Override
	public String toString() {
		return "name= " + this.name + ", address= " + this.address + ", balance= " + this.balance + ", accountNo= "
				+ this.accountNo;
	}

	// Deposit money function
	public void depositMoney() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your 9 digit Account Number: ");
		long acc = sc.nextLong();

		if (acc > 100000000) {
			System.out.println("Enter the AMount to deposit: ");
			float deposit = sc.nextFloat();
			balance += deposit + balance;
			System.out.println("Amount deposit in your account succesfully");
		} else {
			System.out.println("try againg with correct account number...");
		}
	}

	// withdraw function
	public void withdraw() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your 9 digit Account Number: ");
		long acc = sc.nextLong();

		if (acc > 100000000) {

			System.out.println("Enter the Amount to withdraw: ");
			float withdraw = sc.nextFloat();
			if (withdraw > balance) {
				System.out.println("Transaction Succesful...");
			} else {
				{
					System.out.println("Insufficient Balance");
				}
			}
		} else {
			System.out.println("try againg with correct account number...");
		}

	}

	// view balance
	public void viewBalance() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your 9 digit Account Number: ");
		long acc = sc.nextLong();

		if (acc > 100000000) {
			System.out.println("your Balance: " + balance);
		}
	}

	// display account holder information
	public void displayInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your 9 digit Account Number: ");
		long acc = sc.nextLong();

		if (acc > 100000000) {
			System.out.println(toString(acc));
		}
	}

	public String toString(long acc) {
		return "Name= XYZ" + ", Address= Meerut " + ", Balance= " + balance + ", AccountNo= " + acc ;
	}
}

public class Ques6 {

	static BankAccount bank = new BankAccount();

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		Scanner sc = new Scanner(System.in);
		int n = 1;

		while (n != 0) {
			System.out.println("Enter 1: Create a new account:");
			System.out.println("Enter 2: Deposit money into an account:");
			System.out.println("Enter 3: Withdraw money from an account");
			System.out.println("Enter 4: Display the account balance");
			System.out.println("Enter 5: Display the account holder's information");
			System.out.println("Enter 0: Exit");
			System.out.println("Enter your choice: ");
			n = sc.nextInt();
			if (n == 0) {
				n=0;
			}
			if (n == 1) {
				bank.openAcc();
				break;
			} else if (n == 2) {
				bank.depositMoney();
				break;
			} else if (n == 3) {
				bank.withdraw();
				break;
			} else if (n == 4) {
				bank.viewBalance();
				break;
			} else if (n == 5) {
				bank.displayInfo();
				break;
			} else {
				System.out.println("Try again with correct option...");
			}

		}
		
		System.out.println("Thanks for visiting...");
		
	}
}
