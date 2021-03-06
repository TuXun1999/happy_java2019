package array;

import java.util.Scanner;


public class test_array {
	/*
	 * name:
	 * the variable to stand for the array
	 * type:
	 * int, char, ...
	 * size:
	 * the length of the array
	 * index:
	 * the location of the elements
	 * 
	 */
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		String choice;
		boolean leave = false;
		while (leave == false){	
			System.out.println("Which part do you want to see?");
			choice = user_input.next();
			switch (choice){
			case "test":
				//declare the array (fixed length)
				double[] a;
				
				//Create the array
				a = new double[10];
				
				//Initialize the array values (optional)
				for (int i = 0; i < 10; i++){
					a[i] = 0.0;
				}
				
				//declare and create the array
				double[] b = new double[10];
				for (int i = 0; i < 10; i++){
					/*
					 * THe array will be initialized automatically
					 */
					System.out.println("b [" + i + "]: " + b[i]);
				}
				System.out.println("b [ " + 10 + "]" + b[10]); //Out of range, cannot work
				break;
			case "test2":
				test2();
				break;
			case "test3":
				test3();
				break;
			case "swap":
				swap();
				break;
			case "partition":
				partition();
				break;
			case "card":
				card();
				break;
			case "avg_matrix":
				/*
				 * For multi-dimentional array
				 * (do not mix i and j !!!)
				 * form: int[][] a = new int[4][2]
				 * tips: i --> row, j --> column
				 */
				avg_matrix();
				break;
			case "add_matrix":
				double[][] qwq = {{.7,.2,.1},{.3, .6, .1},{.5, .1, .4}};
				add_matrix(qwq);
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
	static void test2(){
		double[] a = new double [9];
		a[4] = 3.55;
		a[8] = 5.99;
		for (int i = 0; i < a.length - 1; i++){
			System.out.println("a[" + i + "]: " + a[i]);
		}
		double[] b = {1,1,1,1,1,1,1,1};
		a = b; //Two dynamic pointers are the same
		System.out.println("a[4]: " + a[4]);
		b[4] = 12.112;
		System.out.println("a[4]: " + a[4]);
	}
	static void test3(){
		double[] x = {3.5, 7.9, 0.0, -7.9, 10.99, 78.9, 66.8, 19.01, 18.9, 99.7};
		
		double sum = 0;
		
		/*for(int i = 0; i < x.length - 1; i ++){
			sum += x[i];
		}
		System.out.println("Sum: " + sum);*/
		for (int i = 0; i < x.length ; i++){
			for (int j = 0; j < i ; j ++){
				sum += x[i] * x[j];
			}
		}
		System.out.println("Sum of all the products of two distinguished elements: " + sum);
	}
	static void swap(){
		double[] x = {3.5, 7.9, 0.0, -7.9, 10.99, 78.9, 66.8, 19.01, 18.9, 99.7};
		double tmp;
		for (int i = 0 ; i <= x.length/2 - 1; i ++){
			/*
			 * Swap the two symmetrical elements
			 */

			tmp = x[i];
			x[i] = x[x.length - 1- i];
			x[x.length - 1 - i] = tmp;

		}
		
		/*Another less efficient, but more direct way
		 * double[] tmp = new double[x.length];
		 * for (int i = 0; i<x.length; i ++){
		 * tmp[i] = x[x.length -1-i];
		 * }
		 * x = tmp; ------> merge the two dynamic pointers
		 */
		for (int i = 0; i < x.length ; i ++){
			System.out.println("x[" + i + "]: " + x[i]);
		}
		
	}
	static void partition(){
		double[] x = {3.5, 7.9, 0.0, -7.9, 
						10.99, 78.9, 66.8, 19.01, 18.9, 99.7};
		//Or, double[] x = new double[]{...}
		int cut = 4;
		//Method 1: by using the dynamic reference...
		
		//Method 2: intialize two arrays directly
		double[] x1 = new double[cut];
		double[] x2 = new double[x.length - cut];
		
		for (int i = 0; i < x1.length; i ++){
			x1[i] = x[i];
			System.out.print(" x1[" + i + "]: " + x1[i]);
		}
		System.out.println();
		for (int i = 0; i < x2.length; i++){
			x2[i] = x[cut + i];
			System.out.print(" x2[" + i + "]: " + x2[i]);
		}
		System.out.println();
	}
	static void partition2(){
		/*
		 * Test my idea...
		 * No need to pay a lot of attention... it is unrelated to the class
		 */
		double[] x = {3.5, 7.9, 0.0, -7.9, 10.99, 78.9, 66.8, 19.01, 18.9, 99.7};
		int cut = 4;
		double[] x1 = new double[cut];
		x1 = x;
		for (int i = 0 ; i<x1.length+1; i++){
			System.out.print(" x1[" + i + "]: " + x1[i]);
		}
		/*
		 * You will find that the length of x1 is automatically extended...
		 */
		System.out.println();
		double[] x2 = new double[x.length - cut];
		x2[0] = x1[4];
		for (int i = 0; i<x2.length; i++){
			System.out.println(" x2[" + i + "]:" + x2[i]);
		}
		
	}
	static void card(){
		String rank[] = {"A", "2", "3", "4","5",
				"6", "7", "8", "9", "10", "Jack", "QUeen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		int choice = (int) (Math.random()*52);
		
		String card="";
		card += rank[choice%13];
		card += " & ";
		card += suit[choice%4];
		
		System.out.println("The card is: " + card);
	}
	static void avg_matrix(){
		double[][] matrix = {{0.92,0.02,0.02,0.02,0.02},
				{.02, .02,.32,.32,.32}, {.02,.02,.02,.92,.02},
				{.92,.02,.02,.02,.02},{.47,.02,.47,.02,.02}};
		
		double [] avgs = new double[5];
		for (int i =0; i < 5; i++){
			double sum =0;
			for (int j = 0; j < 5; j++){
				sum += matrix[i][j];
			}
			avgs[i] = sum/5;
			System.out.println("Average for row " + i + ": " + avgs[i]);
		}
	}
	
	
	static void add_matrix(double[][] a){
		
		double[][] b = {{.8,.3, .5},{.1,.4,.1},{.1, .3, .4}};
		double[][] c= new double[3][3];
		
		System.out.println("matrix c: ");
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
				if (j == 2)
					System.out.println();
			}
		}
		
	}
}
