package test_day1;

public class float_test {
	public static void main(String [] args){
		/*
		 * First comment: floating-point numbers are decidedly 
		 * not the same as real numbers (they are 
		 * approximation intrinsically)
		 * 
		 * Second comment: never tend to divide by 0...
		 * 
		 */
		double a = -3.0;
		double b = 6.662e23;
		double c = 2.8;
		
		System.out.println(a + " " + "+" + c + " " 
				+ "= " + (a + c));
		
		
		System.out.println("Ex -- Solve a quadratic function");
		double a1 = Double.parseDouble(args [0]);
		double a2 = Double.parseDouble(args [1]);
		double a3 = Double.parseDouble(args [2]);
		
		
		System.out.println("Your assigned function is: ");
		System.out.println(a1 + "x^2 " + a2 + " x " + a3 + " = 0");
		double delta = a2 * a2 - 4 * a1 * a3;
		double root1 = (-1*a2 +Math.sqrt(delta))/(2*a1);
		double root2 = (-1*a2 - Math.sqrt(delta))/(2*a1);
		System.out.println("Roots: " + root1 + " " + root2);
		
		System.out.println("Part: bits operations: ");
		int x, y, z;
		x = 11 & 9;
		y = x^3;
		z = y|12;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
}
