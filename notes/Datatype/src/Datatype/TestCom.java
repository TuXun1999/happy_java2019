package Datatype;

public class TestCom {
	//< --name-- > means introducing the generic data type, with a specific name
	public static <T extends Comparable<T>> T greatest(T[] a){//bounded to the comparable ones
		//T means a new generic type. It is sensible within the block
		T max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i].compareTo(max) > 0){ //Some methods are different from original ones
				max = a[i];
			}
		}
		return max;
			
	}
	

}
