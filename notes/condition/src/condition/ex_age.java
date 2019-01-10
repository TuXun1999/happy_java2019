package condition;

public class ex_age {
	/*
	 * a class for a small exercise
	 */
	public static void main(String[] args){
		int age = Integer.parseInt(args[0]);
		
		String des;
		
		if(age <= 18 && age >= 0)
			des = "Jung";
		else if (age >= 18 && age <= 39)
			des = "adult";
		else if (age > 39)
			des = "old";
		else
			des = "Invalid age";
		System.out.println(des);
	}

}
