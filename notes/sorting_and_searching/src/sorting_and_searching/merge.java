package sorting_and_searching;

public class merge {
	public static void sort(int[] a){
		//Slice the array into items
		int[][] items = new int[a.length][1];
		for (int i = 0; i<a.length; i++){
			items[i] = new int[]{a[i]};
		}
		while(items.length > 1){
			items = combine(items);
		}
		
		for(int i = 0; i < items[0].length; i++){
			System.out.print(items[0][i] + "\t");
		}
		
	}
	
	public static int[] merge_two(int[] a , int[] b){
		//Merge two ordered array
		int sum = a.length + b.length;
		int[] res = new int[sum];
		
		int a_index = 0;
		int b_index = 0;
		for(int i = 0; i < res.length; i ++){
			if(a_index < a.length && b_index < b.length)
				if(a[a_index] < b[b_index]){
					res[i] = a[a_index];
					a_index ++;
				}
				else{
					res[i] = b[b_index];
					b_index++;
				}
			else if(a_index >= a.length){
				res[i] = b[b_index];
				b_index++;
			}
			else{
				res[i] = a[a_index];
				a_index++;
			}
		}
		return res;
	}
	
	public static int[][] combine(int[][] a){
		if(a%2 == 0){
			
		}
		else{
			
		}
	}
}
