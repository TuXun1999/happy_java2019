package company_main;

import java.util.ArrayList;

public class Department {
	private String name;
	private String email;

	private double office;
	private double development;
	
	private double employeeSalary = 0;
	
	private ArrayList<Employee> employees;
	
	public Department(
			String name, String email, 
			double office, double development){
		this.name = name;
		this.email = email;
		
		//Budget: office + development
		this.office = office;
		this.development = development; 
		employees = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getOffice() {
		return office;
	}

	public void setOffice(double office) {
		this.office = office;
	}

	public double getDevelopment() {
		return development;
	}

	public void setDevelopment(double development) {
		this.development = development;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public double getTotalExpenses(){
		return (getTotalSalaries() + this.office + this.development);
	}
	
	public void addEmployee(Employee e){
		this.employees.add(e);
	}
	
	public double getTotalSalaries(){
		double result = 0;
		for(Employee temp: this.employees){
			result += temp.employTotalSalary();
		}
		this.employeeSalary = result;
		return result; 
	}
	
	public void printInfo(){
		System.out.println("*******************************************");
		System.out.println("Department Name: " + this.name);
		System.out.println("Total Salaries: " + getTotalSalaries());
		System.out.println("Total Expenses: " + getTotalExpenses());
		System.out.println("*******************************************");
		for(Employee temp: this.employees){
			temp.printInfo();
			System.out.println();
		}
		System.out.println("(End)");
	}
}

	