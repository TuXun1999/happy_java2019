package function_module;

import java.util.Scanner;

public class test_loop {
	public static void main(String[] args){
		
	}
	/*private*/ static void inf(){
		System.out.println("Input your character here: ");
		Scanner user_input = new Scanner(System.in);
		char N = user_input.next().charAt(0);
		char refer = 'R';
		
		while (N != refer){
			System.out.println("Input again: ");
			N = user_input.next().charAt(0);
			
		}
		System.out.println("Done");
		user_input.close();
	}

}
