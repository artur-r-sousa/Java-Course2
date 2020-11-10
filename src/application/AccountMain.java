package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Name: ");
		String name = sc.nextLine();
		Account account = new Account(name);
		
		System.out.println("is there an initial deposit? (y/n) ");
		String test = sc.nextLine();
		String cTest = "y";
		double deposit;
		
		if (test.equals(cTest)) {
			
			System.out.println("Enter deposit value: ");
			deposit = sc.nextDouble();
			account.deposit(deposit);
			
		}
		
		System.out.println("Enter deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated Info account: " + account);
		System.out.println();
		
		
		System.out.println("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated Info account: " + account);
		System.out.println();
		
			
		sc.close();
		
	
	}
	
		
	}
	


