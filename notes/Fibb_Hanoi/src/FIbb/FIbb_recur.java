package FIbb;
import java.util.Scanner;
public class FIbb_recur {
	static int fibbs(int N){
		if (N == 1 || N == 2){
			return 1;
		}
		else{
			return (fibbs(N-1) + fibbs(N-2));
		}
	}
	
	public static void main(String[] args){
		Scanner user_input = new Scanner(System.in);
		int N = user_input.nextInt();
		System.out.println("The correspondig fibbs number: " + fibbs(N));
	}
}
