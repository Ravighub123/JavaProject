package Oops;

public class Citizen extends Person {
	public int SSN;
	
public Citizen()
	{
		System.out.println("default con");
	}
	
	public Citizen(String Name,String CountryName,int age, int SSN)
	{
		
		System.out.println("inside Paarm cons");
		this.Name= Name;
		this.CountryName= CountryName;
		this.age= age;
		this.SSN= SSN;
		
		
		}
	
public void Print() {
		
		System.out.println("SSN is " + SSN);
		
	}

	}

