package Oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Employee emp1 = new Employee();
		 * 
		 * emp1.Name = "Ravi"; emp1.EmpId = 1000; emp1.DisplayName();
		 * 
		 * Employee emp2 = new Employee();
		 * 
		 * emp2.Name = "Hem"; emp2.EmpId = 1000;
		 * 
		 * emp2.DisplayName();
		 * 
		 * Employee emp3= new Employee("Jogendra",1002); emp3.DisplayName();
		 * //emp3.Salary=50000;
		 * 
		 * Employee.DisplaySalary(); Employee.Salary =60000;
		 */
		System.out.println(" ***creating ct1");
		Citizen ct1 = new Citizen();

		ct1.age = 50;
		ct1.Name = "Mike";
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.Print();
		System.out.println(" ***creating ct2");
		Citizen ct2 = new Citizen("Rahul", "India", 30, 8999);
		ct2.Print();
		System.out.println(" ***creating obj1");
		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 1234;
		obj1.Print();

		// Person P1 = new Person();

		//ChromeBrowser CB = new ChromeBrowser();

		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(50000);
		System.out.println("The salary is "+emp.getSalary()	);

	}

}
