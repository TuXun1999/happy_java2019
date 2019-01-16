package Test_object;

public class Tax {
	public static void main(String[] args){
		Employee.set_percent(0.2);
		
		double salaryDara = 65000;
		double bonusDara = 4850;
		
		Employee Dara = new Employee(salaryDara, bonusDara);
	
		System.out.println("THe tax for Dara is: " + Dara.TaxCal());
		
		/*
		 * For public attributes, they can be changed directly
		 */
		Dara.salary= 2000;
		Dara.bonus = 50;
		System.out.println("THe tax for Dara is: " + Dara.TaxCal());
		
		double salaryElaya = 99000;
		double bonusElaya = 4820;
		
		Employee Elaya = new Employee(salaryElaya, bonusElaya);
		System.out.println("THe tax for Elaya is: " + Elaya.TaxCal());
		
		double salaryBahrat = 45000;
		double bonusBahrat = 3820;
		
		Employee Bahrat = new Employee(salaryBahrat, bonusBahrat);
		System.out.println("THe tax for Bahrat is: " + Bahrat.TaxCal());
	}

}
