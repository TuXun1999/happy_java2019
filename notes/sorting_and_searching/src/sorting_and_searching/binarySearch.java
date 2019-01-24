package sorting_and_searching;

public class binarySearch {
	public static int search(int[] a, int item){
		int top = a.length-1;
		int bottom = 0;
		int mid = (int)((top + bottom)/2);
		
		while(true){
			if(a[top] == item){	
				return top;
			}
			else if(a[bottom] == item){
				return bottom;
			}
			else if (top - bottom <= 1){
				return -1;
			}
			else{
				if(a[mid] == item){
					break;
				}
				else if (a[mid] < item){
					bottom = mid;
					mid = (int)((top + bottom)/2);
				}
				else if (a[mid] > item){
					top = mid;
					mid = (int)((top + bottom)/2);
				}
			}
		}
		return mid;
	}

}
