package Test_object;

public class Employee {
	Employee(double mysalary, double mybonus){
		salary = mysalary;
		bonus = mybonus;
	}
	double salary;
	double bonus;
	static double percent = 0.2; //Any instance shares the static attribute; only for this class
	
	public double TaxCal(){ //A method inside a class; it can be used for any instance
		double tax = (salary + bonus) * percent;
		return tax;
	}
	
	public static void set_percent(double a){
		percent = a;
		
	}
	

}
