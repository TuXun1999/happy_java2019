package sorting_and_searching;

import java.util.Arrays;

public class main_class {
	public static void main(String[] args){
		/*
		 * In Google, the searching process is very fast...
		 * It indicates that searching algorithm may be quite complex and effective
		 */
		
		
		Integer[] a = {15,4,2,3,1,10,2,11};
		int[] d = {15,4,2,3,1,10,2,11};
		String[] a2 = {"John", "cat", "bubble", "apple", "Pear", "Apple", "Amen"};
		//bubble.sort(a);
		/*
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		int[] b = {15,4,2,3,1,10,2};
		Arrays.sort(b);
		System.out.println();
		System.out.println("Test of Arrays.sort: ");
		for(int i = 0; i <b.length; i++){
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		System.out.println("3 is at the position: " + binarySearch.search(b,4));
		*/
		merge.sort(d);
	}

}
