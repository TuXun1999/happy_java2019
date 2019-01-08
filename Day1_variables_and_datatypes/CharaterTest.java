package test_day1;

public class CharaterTest {
	public static void main(String [] args){
		char c2 = 'A';
		char c3 = 'b';
		char c4 = 'c';
		
		System.out.println(c2);
		System.out.println(c2 + c3);
		System.out.println(c4);
		
		char c5 = 64205; //ascii number 

		System.out.println(c5);
		
		char c6 = '\uface';
		System.out.println(c6);  
		//utf representation; application to any language
		
		String s1 = "hello";
		System.out.println(s1);
		
		String firstName;
		String lastName;
		firstName = args [0];
		lastName = args [1];
		System.out.println("My first name is: \"" + firstName+ "\"");
		System.out.println("My last name is : " + lastName);
		System.out.println("My name is : " + firstName + " " + lastName);
		
		
		String a = "1234";
		int b = 99;
		String c = b + a;
		
		System.out.println(c);
		/*The system treat b as a string in the addition to
		 * a, another string
		 * However, 
		 * 1. b is still an integer afterwards 
		 * 
		 * 2. if b is a float, the case may fail (failure for
		 * b = 99.1, but success for b = 99...)
		 * 
		 * 3. b + a also works 
		 * 
		 * Thus, pay attention to the data types...
		 */
		
		System.out.println(b + 1);
	}
	
}
