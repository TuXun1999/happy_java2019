package Shippment;

public class Item {
	double height;
	double length;
	double width;
	String type;
	
	public Item(double height, double length, double width, String type){
		this.height = height;
		this.length = length;
		this.width = width;
		this.type = type;
	}
	
	public double volume(){
		return (height*length*width);
	}

}
