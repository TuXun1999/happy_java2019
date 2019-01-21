package test_abstract;

public abstract class CalculationMethods extends Calculation{

	public CalculationMethods(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	
	public void test(){
		System.out.println("Test");
	}
	
	
	public int sub(){
		return (a - b + useFormula()); //useFormula means doing nothing 
	}
	
	public int div(){
		return (a/b);
	}
	
	
	public abstract int useFormula();

}



