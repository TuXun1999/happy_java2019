package test;

public class test {
	public static void factor2(int N) {
		System.out.println("The factors are: ");
		String k = "1 ";
		for (int i = 2; i<=N/2; i++) {
			if (N%i == 0) {
				k += i; 
				k += " ";
			}
		}
		System.out.print(k);
}
}