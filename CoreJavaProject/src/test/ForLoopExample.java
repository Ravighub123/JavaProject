package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num < 11; num++) {
			System.out.println(num);
		}

		System.out.println("end of first  for loop");

		for (int num = 10; num > 0; num -= 2) {
			System.out.println(num);
		}
		System.out.println("end of second for loop");

		int num3 = 4;
		for (int i = 1; i < 11; i++) {
			System.out.println(num3 * i);
		}
		
		int[] arr1 = {2,10,9,32,-1};
		
		for(int i=0;i<arr1.length;i++)
		{System.out.println("Element value "+i +"st value is "+    	 	arr1[i]);}
		
		String str1= "Galaxy is from samsung";
		for (int i =0; i<str1.length();i++)
			System.out.println("char value is "+str1.charAt(i));

	}

}
