package Test_object;

public class Employee {
	Employee(double salary, double bonus, String name){
		/*
		 * constructor can also be overloaded
		 * i.e., you can build two constructors, with different positional arguments
		 * for different case, the program will call the different constructor; 
		 */
		information = new info(salary, bonus, name);
		//------> this keyword means the variable "bonus" is from inside the class, not outside the class !!!
	}
	/*
	 * If you don't use the constructor to initialize the attributes
	 * you should initialize them in the main function; 
	 */
	private info information; 
	static double percent = 0.2; //Any instance shares the static attribute; only for this class
	
	public double TaxCal(){ //A method inside a class; it can be used for any instance
		double tax = (information.salary + information.bonus) * percent;
		return tax;
	}
	
	public static void set_percent(double a){
		percent = a;
		
	}
	public void change_bonus(double bonus){
		//A little test about this keyword
		this.information.bonus = bonus;
	}
	
	public void print_tax(){
		System.out.println("THe tax for " + this.information.name + " is: " + TaxCal());
	}
}
class info{
	double salary;
	double bonus;
	String name;
	
	public info(double salary, double bonus, String name){
		this.salary = salary;
		this.bonus = bonus; 
		this.name = name; 
	}
}
