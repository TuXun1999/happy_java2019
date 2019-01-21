package test_inheritance;

public class CalculationFormula extends CalculationMethods{
	public CalculationFormula(int a, int b){
		super(a,b); //Constructors in the whole series will run
	}
	public int Pythagorean(){
		return (a*a + b*b);
	}
	
	public int addition(){
		return (a + b + 10); //Rewrite the method addition
	}
}
