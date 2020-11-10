package application;

import java.util.Scanner;

import entities.Client;

public class PensionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Client[] vect = new Client[10];
		
		System.out.println("How many rooms will be occupied? ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter Client name: ");
			String name = sc.nextLine();
			System.out.println("Enter Client email: ");
			String email = sc.nextLine();
			System.out.println("Enter desired room number: ");
			int room = sc.nextInt();
			
			vect[room] = new Client(name, email, room);
			
		}
		
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
			
			
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
