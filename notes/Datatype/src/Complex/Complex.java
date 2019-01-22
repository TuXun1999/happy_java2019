package Complex;

public class Complex {
	public static void main(String[] args){
		complex a = new complex(1,2);
		complex b = new complex(1.2,3.4);
		
		System.out.println("Add: " + (a.plus(b)).toString());
		System.out.println("Times: "+ (a.times(b)).toString());
	}
}
