package Oops;

public class Employee {

	public String Name;
	public int EmpId;
	public static int Salary=50000;
	
	public Employee()
	{
		System.out.println("inside default cons");
	}
	
	public Employee(String Var1, int Var2)
	{
		System.out.println("Inside Param cons");
		Name= Var1;
		EmpId=Var2;
	}
	
	public void DisplayName()
	{
		
		System.out.println("Name Of the Employee is "+ 	Name);
		
		
	}
	public static void DisplaySalary()
	{
		System.out.println("Salary of all employee is "+ Salary);
	}
	
}
