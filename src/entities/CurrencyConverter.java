package entities;

public class CurrencyConverter {
	
	
	public double dollarPrice;
	public double dollarBuyIn;
	public static final double iof = 0.06;
	
	public double convert() {
		
		double converted = (dollarPrice * dollarBuyIn); 
		return converted + (converted * iof);
				
	}
	
}
