package Datatype;

public class Datatype {
	static class printArray{
		public <abc> void gen_printing (abc[] a ){
			for(abc temp: a){
				System.out.print(temp + " ");
			}
		}
	}
	
	public static void main(String[] args){
		
		/*
		printArray test = new printArray();
		Integer[] a = {1,2,3,4,7};
		test.gen_printing(a);
		*/
		Double[] a ={1.2, 4.5, 8.2, 3.1, 8.1};
		System.out.println(TestCom.greatest(a));
	}
	
	

}
