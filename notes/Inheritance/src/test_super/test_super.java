package test_super;

public class test_super {
	/*
	 * super means call methods, variable, constructor in the super class
	 * but if you define them again in the subclass
	 * they will be overrode 
	 */
	public static void main(String[] args){
		Animal a = new Animal();
		Dog b = new Dog();
		a.eat();
		b.eat();
		b.test_eat();
		a.print_color();
		b.print_color();
	}

}
