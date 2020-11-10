package application;

import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeStr;

public class EmployeeMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		EmployeeStr employee = new EmployeeStr(); 
				
		System.out.println("Enter employee name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Enter employee Gross Salary: ");
		employee.income = sc.nextDouble();
		
		System.out.println("Enter employee Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee Data: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary: ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated employee data: " + employee);
		
		
		sc.close();

	}

}
