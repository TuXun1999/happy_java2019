package array;
import java.util.ArrayList;
import java.util.LinkedList;


public class test_list {
	public static void main(String[] args){
	/*
	 * List: an object to store any type of data
	 * dimension: automatically adjusted
	 * elements: any type you want, even in same list
	 * import: java.util.List
	 * Operations: 
	 * elements in a Java list can
	 * be inserted, accessed, iterated, and removed;
	 * any type of object can be added to a list;
	 * Sorts:
	 * array list, linked list, stack list, vector list;
	 * List listA = new ArrayList();  --->  special in java; list without dimension
	 * List listB = new LinkedList(); --->  easy to insert another value (no need to shift, just to change the reference to next value)
	 * List listC = new Vector();
	 * List listD = new Stack();
	 * 
	 */
		//Part I: ArrayList
		//test_arraylist();
		
		//Part II: ex
		//ex2();
		
		//Part III: Linked List
		//example();
		
		//Part IV: exs
		//ex3();
		
		//Part V: shuffling
		//shuffle();
		
		//Part VI: matrix operations
		//matrix_multi();
		//tran_matrix();
		
		//Part VII: search
		//search_array();
		search_matrix();
	
	}
	
	static void test_arraylist(){
		ArrayList test = new ArrayList();
		/*
		 *Add elements into the list 
		 */
		test.add("Hello");
		test.add(3.5);
		
		
		for (Object temp: test){
			System.out.println(temp);
		}
		
	}
	static void ex1(){
		String first = "Tom";
		String last = "Smith";
		
		String address = "No.800 Dong Chuan Road";
		String number = "13319413793";
		
		int age = 34;
		
		String[] degrees = {"bachelor", "master", "doctor"};
		//Array list to store any type of data
		ArrayList info1 = new ArrayList();
		info1.add(first);
		info1.add(last);
		
		info1.add(address);
		info1.add(age);
		info1.add(number);
		
		ArrayList<String> info2 = new ArrayList();
		for (int i = 0; i < degrees.length; i++){
			info2.add(degrees[i]);
		}
		
		System.out.println("Name: " 
				+ info1.get(0) + " " + info1.get(1));
		System.out.println("Address: " + info1.get(2));
		System.out.println("Age: " + info1.get(3));
		System.out.println("Tel: " + info1.get(4));
		
		System.out.println("Degrees: ");
		System.out.println("Method 1: ");
		for (int j = 0; j < info2.size(); j++){
			System.out.println(info2.get(j));
		}
		/*
		 * Method 2
		 */
		System.out.println("Method 2: ");
		for (Object temp: info2){
			System.out.println(temp);
		}
		/*
		 * Method 3: print all the elements in one arrayList
		 */
		System.out.println("Method 3: ");
		System.out.println(info2);
		
		
		/*
		 * Methods:
		 * size(): return the size of the arrayList
		 * add(int index, Object element) ---> not compatible if wrong position
		 * remove(int index)
		 * indexOf()	----> return the index of the object; -1 for nonexistence
		 * LastindexOf() -----> similar
		 */
	}
	
	static void ex2(){
		//Create an array list in the type of string
		ArrayList<String> test = new ArrayList<String>();
		/*
		 * As for int,double, the correct way is to use:
		 * ArrayList<Integer> test = new ArrayList<Integer>();
		 * ArrayList<Double> test = new ArrayList<Double>();
		 */
		test.add("2");
		test.add("5");
		test.add("11");
		test.add("3");
		test.add("15");
		
		System.out.println("The array list: ");
		System.out.println(test);
		System.out.println("The position of 5: " + test.indexOf("5"));
		
	}
	
	
	static void example(){
		/*
		 * Methods related to linked list are similar to 
		 * the ones related to Array list
		 */
		
		/*Linked List Declaration*/
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		/*Example to show how to add elements into the list*/
		for (int i = 0 ; i < 6; i ++){
			String tmp = "item" + i;
			linkedlist.add(tmp);
		}
		System.out.println("Linked List contents: " + linkedlist);
		
		/*Add first and last Element*/
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("After addition: " + linkedlist);
		
		
		
		
	}
	static void ex3(){
		int N = 8;
		/*If you don't specify, the data type ArrayList stores the 
		 * general object type!
		 */
		ArrayList<ArrayList> matrix = new ArrayList<ArrayList>();
		
		for (int i = 0; i < N; i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < N; j++){
				row.add(10 + N * 10 * i + 10 * j);
			}
			matrix.add(row);
		}
		for (int i = 0; i < N; i++){
			ArrayList row = matrix.get(i);
			for (int j = 0; j < N; j++){
			System.out.print(row.get(j) + "\t");
			if (j == N - 1)
			System.out.println();
			}
		}
	}
	
	
	static void shuffle(){
		ArrayList<String> cards = new ArrayList<String>();
		
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", ""
				+ "9", "10", "Jack", "Queen", "King"};
		String[] sets = {"Diamond", "Spades", "Hearts", "Clubs"};
		
		for(int i = 0; i < 52; i++){
			String tmp;
			tmp = sets[i%4];
			tmp += "\t";
			tmp += num[i%13];
			cards.add(tmp);
			System.out.println(tmp);
		}
		

		int index = 0;
		
		/*
		 * Two ways to shuffle the cards:
		 * 1. shuffling...
		 * 2. Swap two elements: ****
		 * First, swap 1st element with a random element in [0, 52]
		 * Next, swap 2rd element with a random element in [1, 52]
		 * ... ...
		 * ... ...
		 * until the end of the cards;
		 */
		
		
		/*
		 * My idea: 
		 * 1. pick one random card from all the cards;
		 * 2. add it to the new group;
		 * 3. pick another random card from the rest ones;
		 * 
		 * it is a little difficult and clumsy when applied to 
		 * to the array, since array has the fixed length and it
		 * is not that easy to remove one;
		 * 
		 * so, so far, the best way is "swapping"
		 * 
		 */
		ArrayList<String> shuffle = new ArrayList<String>();
		while(index < 52){
			int ran = (int)(Math.random() * (52-index));
			String card = cards.get(ran);
			cards.remove(ran);
			shuffle.add(card);
			index++;
		}
		
		System.out.println("After shuffling.........");
		for (int i = 0; i < 52; i++){
			System.out.println(shuffle.get(i));
		}
		
	}
	
	
	static void matrix_multi(){
		int N = 3;
		double[][] a = {{.7, .2 , .1},{.3, .6, .1},{.5, .4, .1}};
		double[][] b = {{.8, .3, .5},{.1 , .4, .1},{.1 , .3 , .4}};
		double[][] c = new double[N][N];
		for(int i = 0; i < N; i ++){
			for (int j = 0; j < N; j ++){
				double sum = 0;
				for (int s = 0; s < N; s ++){
					sum += a[i][s] * b[s][j];
				}
				c[i][j] = sum;
			}
		}
		
		for (int i = 0; i < N; i ++){
			for (int j = 0; j < N; j++){
				System.out.printf("%.2f\t", c[i][j]);
				if (j == N - 1){
					System.out.println();
				}
			}
		}
	}
	
	
	static void tran_matrix(){
		int N = 3;
		int M = 4;
		double[][] a = {{33, 15, 14},{3, 55, 21},{0, 17, 12},{7, 0, 15}};
		double[][] a_T = new double[N][M];
		for(int i = 0; i < M; i ++){
			for(int j = 0; j < N; j++){
				a_T[N-1-j][i] = a[i][j];
			}
		}
		for(int i = 0; i < N; i ++){
			for(int j = 0; j < M; j++){
				System.out.print(a_T[i][j] + "\t");
				if (j == M - 1)
					System.out.println();
			}
		}
		
	}
	
	static void search_array(){
		double[] array = {2,3,4,51, 5, 32, 1232};
		int i;
		double ele = 51;
		for (i = 0; i< array.length; i++){
			if(array[i] == ele)
				break;
		}
		/*
		 * Another method to jump out of the loop is to use find == false in
		 * the brackets; 
		 */
		if (i < array.length){
			System.out.println("The element " + ele + " is in the array");
			System.out.println("The location of it is " + i);
		}
		else{
			System.out.println("The element is not in the array");
		}
	}
	
	
	static void search_matrix(){
		double[][] mat = {{2,1,3, 4},{21,45, 5, 7},{9, 10,1.5,6}};
		int rows = mat.length;
		int columns = mat[0].length;
		boolean exist = false;
		double target = 89;
		int i;
		int j=0;
		for (i = 0;  i < rows; i++){
			for (j = 0; j < columns; j++){
				if(mat[i][j] == target){
					exist = true;
					break;
					}
			}
			if (exist){
				break;
				}
			}
		if(exist){
		System.out.println("The element is in the matrix");
		System.out.println("The location is " + i + " " + j);
		}
		else{
			System.out.println("The element is not in the matrix");
		}
	}
	
}
