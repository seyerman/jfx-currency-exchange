package model;

public class CurrencyExchange {

	public CurrencyExchange() {
		
	}
	
	public static double COPtoUSD(double COP) {
		
		double USD = 0;
		
			USD = COP / 3558.19;
			USD = Math.round(USD * 100.0)/100.0;
				
		
		return USD;
		
	}
	
	public static double USDtoCop(double USD) {
		
		double COP = 0;
		
			COP = USD * 3558.19;
			COP = Math.round(COP * 100.0)/100.0;
				
			
		return COP;
		
	}
	
}


