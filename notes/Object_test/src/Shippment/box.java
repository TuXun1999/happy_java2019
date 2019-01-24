package Shippment;

public class box extends 	Item{
	public box(double height, double length, double width, String type){
		super(height, length, width, type);

	}
	
	public double price(double weight){
		if(type == "big"){
			return 1800;
		}
		
		else{
			if(weight <= 500)
				return 1000;
			else
				return 1200;
		}
	}

}
