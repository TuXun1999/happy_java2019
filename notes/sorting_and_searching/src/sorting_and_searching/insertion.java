package sorting_and_searching;

public class insertion {
	public static void sort(int[] a){
		for(int i = 0; i < a.length-1; i++){
			if(a[i] > a[i+1]){
				/*
				 * if a[i] > a[i+1], start to insert a[i+1] into the
				 * previous list 
				 */
				for(int j = i; j >= 0; j--){
					/*
					 * Keep swapping two elements until the former
					 * one is less than the latter one, which indicates
					 * that the element has already been put 
					 * into the right position, and won't be less than 
					 * any element in front of it
					 */
					if(a[j] > a[j+1]){
						int tmp = a[j+1];
						a[j+1] = a[j];
						a[j] = tmp;
					}
					else{
						//Exit the process when the inserted element is in place
						break;
					}
				}
			}
		}
	}

}
