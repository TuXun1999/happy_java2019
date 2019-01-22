package Datatype;

public class Currency {
	String name;
	double rate;
	
	public Currency(String name, double rate){
		this.name = name;
		this.rate = rate;
		
	}
	
	public double exchange(double sourceAmount, Currency a){
		double targetAmount = sourceAmount * (this.rate/a.rate);
		return targetAmount; 
	}

}
