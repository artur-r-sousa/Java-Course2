package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class CurrencyMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter currency = new CurrencyConverter();
		
		System.out.println("dollar price: ");
		currency.dollarPrice = sc.nextDouble();
		
		System.out.println("how many dollars will be bought: ");
		currency.dollarBuyIn = sc.nextDouble();
		
		System.out.println("you will pay R$: " + currency.convert());
		
		
		sc.close();
	}

}
