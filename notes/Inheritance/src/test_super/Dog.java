package test_super;

public class Dog extends Animal{
	String color = "Black";
	
	void print_color(){
		System.out.println("The color of the dog: " + this.color);
		System.out.println("The color of the animal: " + super.color);
	}
	
	public Dog(){
		super(); //--------> it seems that call super won't change the value of color...?!
		//this.color = "Green";
		//It is added automatically if there is no argument to add to super()... by the compiler
		//but sometimes you need the super keyword to call some variable from the super class
	}
	
	void eat(){
		System.out.println("The dog is eating");
	}
	
	void test_eat(){
		super.eat();
	}

}
