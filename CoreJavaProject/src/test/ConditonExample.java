package test;

import java.util.Scanner;

public class ConditonExample {
	public static void main(String[] args) {
	int age;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the age");
	age= scanner.nextInt();
	
	if (age> 30 || age<18)
		
	{
	System.out.println("you are not eligible to write bank exam");
	}
	else if (age==30) {
	
	System.out.println("eligible to write the exam in this year only");
	}
	else
	{
	
	System.out.println("you are eligible for voting");
	}
	scanner.close();
	}
}

