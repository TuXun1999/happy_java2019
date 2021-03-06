package company_main;

public class Employee {
	private String name;
	private String position;
	private int grade;
	private double base_salary;
	private int extra_hours;
	
	public Employee(String name, String position, int grade, int eh){
		this.name = name;
		this.position = position;
		this.grade = grade;
		this.base_salary = employBaseSalary();
		this.extra_hours = eh;
	}
	
	/*
	 * Getters and setters can be generated automatically by Source
	 */
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public double getBase_salary() {
		return base_salary;
	}



	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}



	public int getExtra_hours() {
		return extra_hours;
	}



	public void setExtra_hours(int extra_hours) {
		this.extra_hours = extra_hours;
	}



	private double employBaseSalary(){
		double result;
		switch(this.grade){
		case 1: result = 500000;break;
		case 2: result = 150000; break;
		case 3: result = 125000; break;
		case 4: result = 120000; break;
		case 5: result = 100000; break;
		default: result = 90000; 
		}
		return result; 
	}
	
	private double employBonus(){
		double eh_bonus;
		switch(this.grade){
		case 1: eh_bonus = 1000; break;
		case 2: eh_bonus = 250; break;
		case 3: 
			if (this.position == "Accountant"){
				eh_bonus = 500;
			}
			else
				eh_bonus = 200;
			break;
		case 4: eh_bonus = 120; break;
		case 5: eh_bonus = 80; break;
		default : eh_bonus = 50;
		}
		return (eh_bonus*this.extra_hours);
	}
	
	private double employTax(){
		double salary = totalSalary();
		double percent; 
		if(salary <300000)
			percent = 0.1;
		else
			percent = 0.2;
		return salary*percent; 
	}
	
	private double totalSalary(){
		return (employBonus() + employBaseSalary());
	}
	
	public double employTotalSalary(){
		return (totalSalary() - employTax());
	}
	
	public void printInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Position: " + this.position);
		System.out.println("Bonus: " + employBonus());
		System.out.println("Extra hours: " + this.extra_hours);
		System.out.println("Total Salary (without tax): " + totalSalary());
		System.out.println("Tax: " + employTax());
	}
}
