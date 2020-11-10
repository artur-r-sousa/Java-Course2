package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter student name: ");
		student.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Enter first grade: ");
		student.nota1 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter second grade: ");
		student.nota2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Enter third grade: ");
		student.nota3 = sc.nextDouble();
		
		System.out.println(student.studentAnalysys());
		
		sc.close();

	}

}
