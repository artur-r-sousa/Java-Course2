package entities;

public class Account {
	
	private int accId; 
	private String name;
	private double balance;
	
	public Account(String name) {
		
		this.accId += 1;
		this.name = name;
		
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	public int getAccId() {
		
		return this.accId;
		
	}
	
	public void withdraw(double withdraw) {
		
		this.balance -= withdraw + 5.00;
		
	}

	public void deposit(double deposit) {
		
		this.balance += deposit;
		
	}
	
public String toString() {
		
		return "Account: "
			+ this.getAccId()
			+ ", Name: "
			+ this.getName()
			+ ", Balance: $ "
			+ String.format("%.2f", this.getBalance());
		
	}
	
	
}
