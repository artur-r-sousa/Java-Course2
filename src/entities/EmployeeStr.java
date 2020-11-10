package entities;

public class EmployeeStr {
	
	public String name;
	public double income;
	public double tax;

	
	public double netSalary() {
		
		return income - tax;
		
	}
	
	public void increaseSalary(double percentage) {
		
		income += income * percentage/100;
		
	}
	
	public String toString() {
		
		return name 
			+ ", income: "
			+ String.format("%.2f", income)
			+ ", income after taxes: "
			+ String.format("%.2f", netSalary()); 
			
	}
		
}
