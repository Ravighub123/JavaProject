package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50};
		System.out.println("Length of the array is "+arr1.length); 
		System.out.println("First value inside the arr1 is "+arr1[0]);
		System.out.println("First value inside the arr1 is "+ arr1[arr1.length-1]);
		
		
		String[] arr2= {"Mon","Tue","Wed","Thu","Fri"};
		System.out.println("Value at third position is "+arr2[2]);
		
		String str = "clean world green world";
		String[] arr3= str.split(" ");
		System.out.println("The no. of words in this strinng are:" + arr3.length);

	}

}
