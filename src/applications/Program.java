package applications;

import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


	System.out.println("Enter account data");
	System.out.print("Number: ");
	int number = sc.nextInt();
	System.out.print("Holder: ");
	sc.nextLine();
	String holder = sc.nextLine();
	System.out.print("Initial balance: ");
	double balance = sc.nextDouble();
	System.out.println("Withdraw limit: ");
	double withdraw= sc.nextDouble();
	
	System.out.print("Enter amount for withdraw: ");
	double amount = sc.nextDouble();
	Account acc = new Account(number, holder, balance, withdraw);
	try {
		acc.withdraw(amount);
		System.out.printf("New balance: \n" + acc.getBalance());
	}
	/*catch(InputMismatchException e) {
		System.out.println("Scanner closed");
		}*/
	catch(DomainException e) {
	System.out.println("Withdraw error:" + e.getMessage());
}
	}	
	
}


