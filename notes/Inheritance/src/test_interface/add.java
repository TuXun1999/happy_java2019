package test_interface;

public class add implements BasicMath{
	//You have to implement every abstract method in BasicMath!!!
	public double addition(double a, double b){
		return (a + b);
	}

	@Override
	public double multi(double a, double b) {
		
		return (a*b);
	}
	
	/*
	 * ----> for the two abstract methods in the interface
	 * they are instance methods in fact, so they cannot be declared static 
	 * when given a body, an abstract method is an instance method
	 * this is because:
	 * static method cannot be overriden!!
	 * but abstract method are born to be overriden, so they are incompatible
	 * 
	 * The point of polymorphism is 
	 * that you can subclass a class
	 *  and the OBJECTS implementing those subclasses 
	 *  will have different behaviors for the same methods 
	 *  defined in the superclass (and overridden in the subclasses). 
	 *  A static method is not associated with any instance of a class 
	 *  so the concept is not applicable.
	 */
	public static void test(){
		System.out.println("Test");
	}
}
