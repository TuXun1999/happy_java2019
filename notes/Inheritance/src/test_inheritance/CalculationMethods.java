package test_inheritance;

public class CalculationMethods extends Calculation{
	/*
	 * subclass
	 */
	public CalculationMethods(int a, int b){
		/*
		 * Both the original and the subordinate classes have to 
		 * call the constructor;
		 */
		super(a,b); //-----> this won't be called automatically... it needs positional parameters; 
		/*
		 * a reference variable which is used to refer immediate parent class object;
		 * super is used to access the data and methods in the parent class
		 * -----> methods, variables, constructors are all available by super keyword
		 */
	}
	public int addition(){
		return (a + b + 5);
	}
	
	public int substraction(){
		return (a - b);
	}
	public int multiplication(){
		return (a*b);
	}
	
	public int division(){
		return (a/b);
	}
	/*
	 * override the methods in the super class
	 * (repeat the methods in subclass 
	 * with same name and same arguments) 
	 *  --> different arguments ---> overloading
	 *  --> same name & same arguments --> overriding, rewrite the old method                                        
	 */
	public int remains(){
		return (a%b)*2;
	}
	
	public int formula(){
		return (a*b*2);
	}
}
