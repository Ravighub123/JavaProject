package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "nitiN";
		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);
		}

		System.out.println("the reversal string is " + result);

		if (str1.equalsIgnoreCase(result)) {
			System.out.println("its palendrome");
		} else {
			System.out.println("its not palendrome");
		}
		String str2 = "David meets John & Lily";
		String[] arr =str2.split(" ");
		String result1= "";
		for(int i=arr.length-1;i>=0;i--)
		{
			result1=result1+arr[i]+" ";
		}
		
		System.out.println("the result is "+result1.trim());
		
	}

}
