package test_abstract;

public class Calculation {
	int a, b;
	public Calculation(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int remains(){
		return (a%b);
	}
	public int addition(){
		return (a + b);
	}
	public int multiplication(){
		return (a * b* 2);
	}

}
