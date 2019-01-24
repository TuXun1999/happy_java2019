package sorting_and_searching;

public class selection {
	public static void sort(int[] a){
		/*
		 * Swap the first number and the maximum/minimum in the rest elements
		 */
		for (int i = 0; i < a.length - 1; i++){
			
			//Find the minimum in the rest part, as well as its position
			int min = a[i+1];
			int index = i + 1;
			for(int j = i+2; j < a.length; j++){
				if(a[j] < min){
					min = a[j];
					index = j;
				}
			}
			
			//Swap a[i] and the minimum
			if (a[i] > min){
				int tmp = a[index];
				a[index] = a[i];
				a[i] = tmp;
			}
		}
	}
}
