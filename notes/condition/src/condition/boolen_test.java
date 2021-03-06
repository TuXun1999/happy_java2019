package condition;

import java.awt.print.Book;

public class boolen_test {
	public static void main(String[] args){
		//Part I: boolen macro?
		int a = 12;
		int b = 3;
		
		String sup = 
		(a < b) ? "smaller": (a > b) ? "bigger" : "equal";
		/*
		 * if a < b, sup = "smaller"
		 * else if a > b, sup = "bigger"
		 * else, sup = "equal"
		 */
		System.out.println(sup);
		
		double a1 = 3.5;
		double b1 = 3.5;
		String sup1 = 
		(a1 == b1) ? "equal" : (a1 > b1) ? "bigger" : "smaller";
		System.out.println(sup1);
		
		
		//Part II: ex: leap year
		int year = Integer.parseInt(args[0]);
		boolean isleapyear =  //Standard form of naming
		(year % 400 == 0) ? true : 
			(year % 4 == 0 && year % 100 != 0) ? true : false;
		System.out.println("The tested year: " + args[0]);
		System.out.println("It's a leap year?");
		System.out.println(isleapyear);
		/*
		 * another method:
		 * boolean isleapyear = year % 4 == 0 && year % 100 != 0
		 * isleapyear = isleapyear || year % 400 ==0
		 * 
		 * this is more creative !!
		 * 
		 */
		
		
		//Part III: absolute value
		double x = Double.parseDouble(args[1]);
		double abs_x = (x > 0.0) ? x : -x;
		System.out.println(
				"Number: " + x + "   " + "Abs: " + abs_x);
		/*
		 * Or in a more intuitive way...
		 * if (x > 0){
		 * abs_x = x;
		 * }
		 * else
		 * abs_x= -x;
		 */
		
		//Part IV: swap (easiest way is to use a tmp container)
		double s = Double.parseDouble(args[2]);
		double t = Double.parseDouble(args[3]);
		if (s < t){
			s = s + t;
			t = s - t;
			s = s - t;
		}
		System.out.println("The two numbers: " + s + " " + t);
		/*
		 * x = Double.parseDouble(args)
		 * y = Double.parseDouble(args)
		 * (x > y)? pass: (x = x + y; y = x -y; x = x-y;)
		 */
		
		//Part V: a little ex
		int x0 = Integer.parseInt(args[4]);
		if ( x0 > 1000000){
			System.exit(1);
		}
		else{
			System.out.println(
					"The square of the value: " + (x0 * x0));
		}
		
		//Part VI: if-else statement ( no need to add a curly bracket for only one statement)
		double x_max;
		if (x > a1)
				x_max = x;
		else
			x_max = a1;
		/*
		 * just use x_max = (x > a1) ? x : a1 is faster...
		 */
		
		//Part VII: a number divided by 3..?
		int num = 8;
		System.out.println((num%3 == 0)? true: false);
		/*
		 * Or, use if-else way...though more complicated
		 */
		
		//Part VIII: sign of a number
		double check_num = -4;
		if (check_num > 0)
			System.out.println("It is positive");
		else if (check_num == 0)
			System.out.println("It is equal to zero");
		else
			System.out.println("It is larger negative");
		/*
		 * A faster way is to :
		 * System.out.println(
		 * (check_num > 0) ? "Positive" : 
		 * (check_num < 0)? "Negative" : 
		 * "Zero"
		 * )
		 */
		
		//Part X: check the number in an interval
		int check_numX = Integer.parseInt(args[5]);
		if (check_numX >= 0 && check_numX <= 5){
			System.out.println(
				check_numX + " is within the range [0,5]");
			if (check_numX == 1)
				System.out.println("Your number is one");
			//similar for other numbers...
		}
		else
			System.out.println(
					check_numX + " is beyond the range [0, 5]");
		/*
		 * A faster way to go:
		 * System.out.println((
		 * check_numX >=0 && check_numX <= 5) ? "Yes" : "No")
		 */
		
		
		//Part XI: compute your tax 
		int income = Integer.parseInt(args[6]);
		if (income <= 47449)
			System.out.println(
				"Your tax is: " + income*0.22	
					);
		else if (income <= 114650)
			System.out.println(
				"Your tax is: " + income * 0.25
				);
		else if (income <= 174700)
			System.out.println(
					"Your tax is: " + income*0.28	
						);
		else if (income <= 311950)
			System.out.println(
					"Your tax is: " + income*0.33	
						);
		else 
			System.out.println(
					"Your tax is: " + income*0.35	
						);
					
		
	
				
	}
}
