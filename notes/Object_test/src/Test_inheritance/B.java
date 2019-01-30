package Test_inheritance;

public class B extends A{
	public String name;
	B(){
		/*
		 * First, super()
		 * Then, its original value (override values in super())
		 * Next, values in the constructor
		 */
		super();
		this.name = "Two";
	}

}
