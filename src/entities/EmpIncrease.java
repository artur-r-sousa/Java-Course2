package entities;

public class EmpIncrease {
	private int id;
	private String name;
	private double income;
	
	public EmpIncrease(int id, String name, double income) {
		
		this.id = id;
		this.name = name;
		this.income = income;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public void setIncomeIncrease(int id) {
		this.income += income * 10 / 100;
	}
	
	public String toString() {
		
		return id  
			+ ", "
			+ String.format(name)
			+ ", "
			+ String.format("%.2f", income);
		
	}
}
