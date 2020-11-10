package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleStr;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		RectangleStr rectangle = new RectangleStr();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Rectangle data: " + rectangle);
		
		
		
		
		sc.close();

	}

}
