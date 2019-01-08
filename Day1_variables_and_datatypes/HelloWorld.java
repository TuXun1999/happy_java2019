package test_day1;  // package name
 
public class HelloWorld {     //class name
	public static void main(String[] args){   // method name
		int a, b, c;   //Declare a variable
		
		
		//Part I: an example to show the structure of java
		System.out.println("hello, world");  
		//Do not forget String[] args !!
		
		
		//Part II: an example for the variable 
		a = 5;
		b = 3;
		c = a + b;
		int t = a;
		a ++;
		System.out.println(c);
		System.out.println(t);
		
		//Part III: float
		/*a very large or a very small number must be converted
		 * into bits (0 and 1) in hardware (1.4e-23, 1.4e+23)
		 * how to solve this?
		 * solution: a float point
		 * move the point to some place, and make approximation
		 * so that less bytes are in need to store the value
		 */
		
		
		//Part IV: integer & operations
		a = Integer.parseInt(args [0]);
		b = Integer.parseInt(args [1]);
		//Read the numbers from configuration part !!!!!
		int addition, division, remainder;
		addition = a + b ;
		division = a / b;
		remainder = a%b;
		System.out.println("Exercise 1: ");
		System.out.println(addition);
		System.out.println(division);
		System.out.println(remainder);
		System.out.print("addition of above: ");
		System.out.println(addition + division + remainder);
		//System.out.print("hello, " + (addition));
		
		//Part V: bits shift
		System.out.println("Ex2: ");
		int sh = a >>> 4; 
		//also ok for a >> 4
		//Leftward: use a << 4...
		System.out.println(sh);
	
	}   
	//any command must be ended with semicolon
}
