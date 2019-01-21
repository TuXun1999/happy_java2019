package test_inheritance;

public class test_inheritance {
	/*
	 * For static methods, they can be inherited, too
	 * But they cannot be overriden
	 * they are just hided, if there is same signature; 
	 */
	public static void main(String[] args){
		CalculationMethods ex = new CalculationMethods(17,5);
		CalculationFormula ex1 = new CalculationFormula(17,5);
		System.out.println("Remains " + ex.remains());
		System.out.println("Addition(original): " + (17 + 5));
		System.out.println("Addition: " + ex.addition());
		System.out.println("Substraction: " + ex.substraction());
		System.out.println("Multi: " + ex.multiplication());
		System.out.println("Div: " + ex.division());
		System.out.println("Formula: " + ex.formula());
		System.out.println("Pythagorean: " + ex1.Pythagorean());
		System.out.println("Addition (ex1): " + ex1.addition());  
		
	}

}
