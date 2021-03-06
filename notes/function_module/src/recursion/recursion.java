package recursion;

public class recursion {
	static int gcd(int i, int j){
		int a = (i <= j)? i:j;
		int b = i + j - a;
		
		if(b%a == 0)
			return a;
		else
			return gcd(b-a, a);
	}
	public static void main(String[] args){
		int i = 24;
		int j = 39;
		System.out.println("gcd(" + i + " , " + j + "):");
		System.out.println(gcd(i, j));
	}

}
