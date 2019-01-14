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
				case "test":
					//Part V:    (for loop)
					/*
					 * It is recommended that do not 
					 * use index (usually i) again outside
					 * for loop;
					 * 
					 * i.e. adopt the structure
					 * for (int i = 0; condition; step){}
					 * Construct and use i only inside 
					 * the "for" loop
					 * 
					 * if there is no condition inside 
					 * the bracket, this is an infinite 
					 * loop
					 * 
					 */
					test();
					break;
				case "sum":
					sum();
					break;
				case "product":
					product();
					break;
				case "list2":
					list();
					break;
				case "fibb":
					fibb();
					break;
				case "dots":
					dots();
					break;
				case "tower":
					tower();
					break;
				case "reverse":
					reverse();
					break;
				case "inf":
					inf();
					break;
				case "bits":
					bits();
					break;
				case "prime":
					prime();
					break;
				case "factor":
					factor(N);
					break;
				case "flips":
					flips();
					break;
				case "factor2":
					factor2(N);
					break;
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
		System.out.println("The even numbers are: ");
		for (int i = 0; i < 52; i += 2){
			System.out.print(i + " ");
		}
		System.out.println();
		
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
		user_input.close();
		return t;
	}
	
	
	static void test(){
		/*
		 * Simple example for a "for" loop
		 */
		for (int i =20; i>9; i--){
			System.out.println(i);
		}
	}
	
	
	static void sum(){
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		
		int sum = 0;
		for (int i = 1; i< N+1; i++){
			sum += i;
		}
		System.out.println("Sum from 1 to N: " + sum);
		user_input.close();
	}
	
	
	static void product(){
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		
		int product = 1;
		for (int i = 1; i < N+1; i++){
			product *= i;
		}
		System.out.println("Product from 1 to N: " + product);
		user_input.close();
	}
	
	
	static void list(){
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		
		for (int i = 1; i< N + 1; i++){
			System.out.print(i + "\t");
			if (i % 4 == 0)
				System.out.print("\n");
		}
		user_input.close();
	}
	
	
	static void fibb(){
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < N; i ++){
			if (i == 0)
				System.out.print(1 + " ");
			else {
				System.out.print(b);
				System.out.print(" ");
				int tmp;
				tmp = a;
				a = b;
				b = tmp + b; 
				/*
				 * A cool way to use only two variables:
				 * b = 2*a + b
				 * a = b - 2*a
				 * b = b - (b-a)/2
				 */
				
				/*
				 * Another better method:
				 * a = 0, b = 1
				 * for (int i = 0; i< N + 1; i++){
				 * print(b)
				 * int tmp = a;
				 * a = b;
				 * b = tmp + b; 
				 * }
				 * 
				 * 
				 */
			}
		}
		user_input.close();
	}
	
	
	static void dots(){
		int rows = 8;
		int columns = 16;
		for (int i = 0; i<rows; i++){
			for (int j = 0; j< columns; j++){
				System.out.print("* ");
				if (j == columns - 1){
					System.out.print("\n");
				}
			}
		}
	}
	
	
	static void tower(){
		int rows = 12;
		for (int i = 1; i<=rows; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(j + " ");
				if (j == i){
					System.out.println();
				}
			}
		}
	}
	
	
	static void reverse(){
		int num = 23467;
		int result = 0;
		/*
		 * To reverse an integer, find the remainder of it!!!
		 * (do not try to use -1...)
		 */
		do {
			result = result * 10 + num%10;
			num = (num -num%10)/10;
		}
		while (num>0);
		System.out.println(result);
	}
	
	
	static void inf(){
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
	
	
	
	static void bits(){
		System.out.println("Input your number here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		String result = "";
		
		do{
			result = (N%2) + result;
			N = (N -N%2)/2;
		}
		while(N > 0);
		
		System.out.println("The binary form: " + result);
		user_input.close();
	}
	
	
	static boolean isprime(int j){
		boolean result = true;
		for(int i = 1; i <= Math.sqrt(j); i++){
			if (j%i == 0 && i>1){
				result = false;
				break;
			}
		}
		return result;
	}
	
	
	static void prime(){
		System.out.println("Input your integer here: ");
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		
		System.out.println("The prime numbers less than " + N);
		for(int i = 2; i<=N; i++){
			if (isprime(i) == true){
				System.out.print(i + " ");
			}
		}
		user_input.close();
	}
	
	static int get_power(int N, int i) {
		int j = 0;
		int power;
		while (true){
			power = (int) Math.pow(i, j);
			if (N%power == 0) {
				j++;
				continue;
			}
			else
				break;
		}
		return (j-1);
	}
	
	
	static void factor(int N) {
		String product = "";
		for (int i = 2; i<= N/2; i++) {
			if (N%i == 0 && isprime(i) == true) {
				//Find the factors of N as well as its power
				int m = get_power(N, i);
				product += i;
				if(m > 1) {
					product += "^";
					product += m;
				}
				product += "*";	
			}
		}
		String result = "";
		System.out.println("The standard form of factorizatoin: ");
		for (int j = 0; j< product.length()-1; j++) {
			result += product.charAt(j);
		}
		System.out.println(result);
	}
	
	
	static void flips() {
		double high = 50.0;
		double low = 0.0;
		double init = 25.0;
		double flip;
		int times = 0;
		
		
		while (init >= low && init <= high) {
			flip = Math.random();
			if (flip >= 0.5) {
				init += 0.7;
			}
			else
				init -= 0.7;
			
			times++;
		}
		System.out.println("Total times for play: ");
		System.out.println(times);
	}
	
	
	static void factor2(int N) {
		System.out.println("The factors are: ");
		String k = "1 ";
		for (int i = 2; i<=N/2; i++) {
			if (N%i == 0) {
				k += i; 
				k += " ";
			}
		}
		System.out.print(k);
}
	
}
