package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalStudentGrade() {
		
		return nota1 + nota2 + nota3;
	}
	
	
	public String studentAnalysys() {
		String a = "Pass: ";
		String b = "Failed: ";
		
		if (finalStudentGrade() >= 60) {
			
			return a + finalStudentGrade();
						
		
		} else {
			
			return b + ("Missing " + (60 - finalStudentGrade()) + " points");
			
		}
	
		
	}
	
}
