package condition;

public class condition_2 {
	public static void main(String[] args){
		
		//Part I: switch statement
		/*
		 * Before version 7, string cannot be put into switch
		 * 
		 * Do not try to compare two different types of data 
		 * in one switch statement
		 * 
		 * Always remember to add a break to exit the program
		 * after execution in each case
		 */
		int num = Integer.parseInt(args[0]);
		String day;
		switch(num){
			case 0:
				day = "Monday";
				break;
			case 1:
				day = "Tuesday";
				break;
			case 2:
				day = "Wednesday";
				break;
			case 3:
				day = "Thursday";
				break;
			case 4:
				day = "Friday";
				break;
			case 5:
				day = "Saturday";
				break;
			case 6:
				day = "Sunday";
				break;
			default:
				day = "It is not within the range of a week";
				
		}
		System.out.println(day);	
		
		//Part II: ex_age
		
		//Part III: maximum in three variables
		
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		int c = Integer.parseInt(args[3]);
		
		int max = (a>=b)? a:b;
		max = (max >= c) ? max:c;
		System.out.println("The maximum number is: " + max);
		
	}
}


