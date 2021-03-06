package function_module;
import java.util.Scanner;
import test.test; //Import a class from another package


public class test_function {
	/*
	 * Methods inside the class
	 */
	public static void swap(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
	}
	public static int rand(int N){
		int ran = (int)(Math.random()*N);
		return ran;
		
	}
	
	public static boolean isprime(int N){
		for(int i = 2; i <= Math.sqrt(N); i ++){
			if(N%i == 0)
				return false;
		}
		return true;
	}
	
	public static int[] square_array(int N){
		int[] array = new int[N+1];
		for (int i = 0; i <= N; i++){
			array[i] = i * i;
		}
		return array;
	}
	
	public static void print_array(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
	}
	
	public static void main(String[] args){ //Standard way to define method "main"
		/*
		 * Function: static methods in java ---> separate the task, reuse codes
		 * 
		 * public: accessible to programs outside the class
		 * ------> in contrast to protected, private
		 * 
		 * void: type of the function (return type)
		 * 
		 * static: 
		 * To create a static member(block,variable,method,nested class), 
		 * precede its declaration with the keyword static. 
		 * When a member is declared static, 
		 * it can be accessed before any objects of its class are created, 
		 * and without reference to any object.
		 * 
		 * static block: do a computation only once
		 * 
		 * static variable: a kind of variable shared by any instance of the class
		 * 
		 * static methods: Any static member can be accessed before 
		 * any objects of its class are created, 
		 * and without reference to any object
		 * in other words, the methods can be called directly upon the class
		 * 
		 * 
		 * 
		 * parameters: arrays can be transferred directly to a function
		 * the location of the function doesn't affect its functionality
		 * 
		 */
		//Part I: typical swapping method   
		//----> verify that the delivering a variable to a function actually only means giving a copy of the value of the variable to the function in java
		int a = 2;
		int b = 3;
		swap(a,b);
		System.out.println(a + " " + b); 
		/*Question is, how to swap two numbers by function without pointer?
		 * Solution: You can include a, b into a dynamic instance of a class
		 */
		
		//Part II: example  ---> local variables is accessible only inside the block
		int N = 13;
		int rand = rand(N);
		System.out.println("Random number: " + rand);
		
		//Part III: more examples
		System.out.println("Is number " + N + " a prime number? ");
		System.out.println(isprime(N));
		
		
		
		System.out.println("Input your integer here: ");
		Scanner user_input = new Scanner(System.in);
		int M = user_input.nextInt();
		int[] array = square_array(M);
		System.out.println("The array is: ");
		print_array(array);
		user_input.close();
		
		//Part IV: Module
		/*
		 * Module: a group of methods, which can compile independently
		 * (In java, you can override old method----> write two different types
		 * of functions with the same name; the compiler will deal with this
		 * But, the arguments must be different)
		 * 
		 * Libraries: important modules?...
		 * 
		 * To call a function, for the static methods, 
		 * just use the class
		 */
		test_loop.inf();  
		//Pay attention that class test_loop is in the same package (package function_module)
		//Also pay attention that if method inf() is private, it is not accessible, even in the same package!!!
		test.factor2(15);
		//To use the class in another package, use import !!!
	}
}
