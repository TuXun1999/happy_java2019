package company_main;

public class company_main {
	public static void main(String[] args){
		Department management = new Department("Management", "#", 50000, 20000);
		Employee gm = new Employee("Alice", "General Manager", 1, 20);
		Employee m1 = new Employee("Bob", "Manager", 2, 20);
		Employee m2 = new Employee("Bryant", "Manager", 2, 20);
		Employee mt1 = new Employee("Cat", "Employee Type 1", 4, 20);
		management.addEmployee(gm);
		management.addEmployee(m1);
		management.addEmployee(m2);
		management.addEmployee(mt1);
		System.out.println("Management Department: ");
		System.out.println("$" + management.getTotalExpenses());
		management.printInfo();
		
		Department accounting = new Department("Accounting", "#", 50000, 20000);
		Employee dd = new Employee("David", "Department Director", 2, 15);
		Employee a1 = new Employee("Elice", "Accountant", 3, 15);
		Employee a2 = new Employee("Eria", "Accountant", 3, 15);
		Employee et21 = new Employee("Frank", "Employee Type 2", 4, 15);
		Employee et22 = new Employee("Frey", "Employee Type 2", 4, 15);
		accounting.addEmployee(dd);
		accounting.addEmployee(a1);
		accounting.addEmployee(a2);
		accounting.addEmployee(et21);
		accounting.addEmployee(et22);
		System.out.println("Accounting Department: ");
		System.out.println("$" + accounting.getTotalExpenses());
		
		Department sales = new Department("Sales", "#", 50000, 20000);
		Employee dds = new Employee("Dean", "Department Director", 2, 15);
		Employee ets21 = new Employee("Fact", "Employee Type 2", 4, 15);
		Employee ets22 = new Employee("Feat", "Employee Type 2", 4, 15);
		Employee et31 = new Employee("Grace", "Employee Type 3", 6, 14);
		Employee et32 = new Employee("Green", "Employee Type 3", 6, 16);
		sales.addEmployee(dds);
		sales.addEmployee(ets21);
		sales.addEmployee(ets22);
		sales.addEmployee(et31);
		sales.addEmployee(et32);
		System.out.println("Sales Department: ");
		System.out.println("$" + sales.getTotalExpenses());
		
		Department IT = new Department("IT", "#", 50000, 40000);
		Employee ddi = new Employee("Henry", "Department Director", 2, 20);
		Employee eti1 = new Employee("Iron", "Employee Type 1", 4, 20);
		Employee eti2 = new Employee("Ion", "Employee Type 1", 4, 20);
		Employee eti3 = new Employee("Jack", "Employee Type 3", 6, 20);
		IT.addEmployee(ddi);
		IT.addEmployee(eti1);
		IT.addEmployee(eti2);
		IT.addEmployee(eti3);
		System.out.println("IT Department: ");
		System.out.println("$" + IT.getTotalExpenses());
	}
}
