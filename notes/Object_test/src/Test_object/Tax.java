package Test_object;

public class Tax {
	public static void main(String[] args){
		Employee.set_percent(0.2);
		
		double salaryDara = 65000;
		double bonusDara = 4850;
		
		Employee Dara = new Employee(salaryDara, bonusDara, "Dara");
	
		Dara.print_tax();
		
		/*
		 * For public attributes, they can be changed directly
		 * (if you don't build the attributes in the first place,
		 * initialize them in the program!!)   
		 */
		
		
		/*
		Dara.salary= 2000;
		Dara.bonus = 50;
		Dara.print_tax();*/
		
		//Dara.set_percent(0.5); ----> you'd better not to do this
		Dara.change_bonus (90);
		Dara.print_tax();
		
		double salaryElaya = 99000;
		double bonusElaya = 4820;
		
		Employee Elaya = new Employee(salaryElaya, bonusElaya, "Elaya");
		Elaya.print_tax();
		
		
		double salaryBahrat = 45000;
		double bonusBahrat = 3820;
		
		Employee Bahrat = new Employee(salaryBahrat, bonusBahrat, "Bahrat");
		Bahrat.print_tax();
		System.out.println("The total tax: " + (Dara.TaxCal()+Elaya.TaxCal()+Bahrat.TaxCal()));
	}

}
