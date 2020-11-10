package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.EmpIncrease;

public class EmpIncreaseMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of employees to add: ");
		int n = sc.nextInt();
		
		List<EmpIncrease> objList = new ArrayList<>();
		List<Integer> idList = new ArrayList<>();
			
		for (int i=0; i<n;) {
			System.out.println("Enter Employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			if (idList.contains(id)) {
				System.out.println("Id Already in use. Please try another");
				
			}else {
				System.out.println("Enter Employee name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Employee income: ");
				double income = sc.nextDouble();
				
				EmpIncrease emp = new EmpIncrease(id, name, income);
				idList.add(emp.getId());
				objList.add(emp);
				i++;
			}
		}			
		
		System.out.println("List of Employees: ");
		for (Object x : objList) {			
			System.out.println(x.toString());			
		}		
		System.out.println("Enter Employee Id to receive a raise: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for (EmpIncrease x : objList.stream().filter(x -> x.getId() == id).collect(Collectors.toList())) {
			if (id == x.getId()) {
				x.setIncomeIncrease(id);				
				for (Object y : objList) {					
					System.out.println(y.toString());					
				}
				
			}else {
				System.out.println("Id Not Found");
			}	
		}					
		sc.close();
	}
}
