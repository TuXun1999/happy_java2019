package test_abstract;

public class test_abstract {
	/*
	 * Abstraction means putting an empty method here, 
	 * let the subclass to override it
	 * for abstract methods, do remember to add keywords abstract
	 * 
	 * abstract class means it is unable to be instantiated!!
	 * but it can be inherited
	 */
	
	/*
	 * Interfaces:
	 * a reference type in Java which serves as a collection of abstract methods
	 * ----> a class can IMPLEMENT an interface
	 */
	public static void main(String[] args){
	userFormula my_formula = new userFormula(17,2);
	my_formula.test();
	System.out.println(my_formula.useFormula());
	System.out.println(my_formula.sub());

}
}