package test_super;

public class Animal {
	String color = "Green";
	
	void eat(){
		System.out.println("The animal is eating");
	}
	void print_color(){
		System.out.println("The color of the animal: " + color);
	}
	
	public Animal(){
		this.color = "White";
	}
}
