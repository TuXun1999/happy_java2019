package test_day1;

public class type_conversion {
	public static void main(String [] args){
		//Part I: int 2 string
		int a = 3;
		String b = "" + a;
		System.out.println(b);
		
		//Part II: str 2 int
		/*
		 * Integer.parseInt("124")
		 */
		
		//Part III: float/double <-> int
		/*
		 * (int) 2.65 = 2
		 * Math.round(2.65) = 3
		 * 11*.3 = 3.3 (int 2 double)
		 * (int) 11*0.3 = 3
		 * 11* (int) 0.3 =0
		 */
		
		//Part IV: random
		double r = Math.random();
		int N = Integer.parseInt(args[0]);
		//generate a random number in [0,1]
		System.out.println((int)(r*N));
		
		//Part V: math
		double x = Double.parseDouble(args[1]);
		double item0 = 3*x*x*x;
		double item1 = -5*Math.sqrt(Math.abs(x));
		double item2 = 3*x*x;
		double item3 = -1*Math.exp(-3*x);
		System.out.println(item0 + item1 + item2 + item3);
		
		//Part VI: Ex~~
		int start = Integer.parseInt(args[2]);
		int end = Integer.parseInt(args[3]);
		double result = start + (end - start) * r;
		System.out.println((int)result);
	}
}
