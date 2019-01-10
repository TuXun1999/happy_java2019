package loop;
import java.util.Scanner;


public class test_loop {
	
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		String choice;
		boolean leave = false;
		while (leave == false){	
			System.out.println("Which part do you want to see?");
			choice = user_input.next();
			int N = Integer.parseInt(args[0]);
			switch (choice){
				case "list":
					/*
					 * structure of a while loop:
					 * while(condition){}
					 * 
					 * loop goes on at the condition
					 */
					//Part I: print out a list (while loop)
					int num = 10;
					list(num);
					break;
				case "power":
					//Part II: power  (while loop)
					System.out.println("Power: " + power(N));
					break;
				case "max_power":
					//Part III: print the largest 2 powers less than N
					System.out.println("Largest: " + max_power());
					break;
				case "Newton":
					//Part IV: use Newton Raphson to obtain the square root of given number
					System.out.println("Square Root: " + Newton_root());
					break;
				case "l;":
					//Part V:    (for loop)
					/*
					 * It is recommended that do not 
					 * use index (usually i) again outside
					 * for loop;
					 * 
					 * i.e. adopt the structure
					 * for (int i = 0; condition; step){}
					 * Construct and use i only inside 
					 * the for loop
					 */
					System.out.println("");
				case "q":
					leave = true;
					break;
				default:	
			}
			if (leave)
				break;
			else
				continue;	
		}
		user_input.close();
	}
	
	static void list(int num){
		while (num<= 50){
			System.out.println("Number: " + num);
			num ++;
		}
		
	}
	static int power(int N){
		int result = 1;
		while (N > 0){
			result *= 2;
			N --;
		}
		return result;
	}
	
	static int max_power(){
		int result = 1;
		System.out.println("Input your number: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		while (result <= N){
			result *= 2;
		}
		user_input.close();
		return result/2;
	}
	static double Newton_root(){
		/*
		 * This is how the function built inside mat library
		 * works. This can give an indication 
		 */
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		double N = user_input.nextDouble();
		double t = 1;
		System.out.println("Input your precision (Recommend: 0.000000000001): ");
		double precision = user_input.nextDouble();
		while(Math.abs(t - N/t) >= precision){
			t = (t + N/t)/2;
		}
		return t;
	}
}
