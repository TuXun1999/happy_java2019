package Shippment;

public class Good extends Item{
	double weight; 
	
	
	public Good(double height, double length, double width, double weight, String type){
		super(height, length, width, type);
		this.weight = weight;
	}

}
