package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		
		while (num1>0)
			
		{
            if (num1==5)
            {
            	System.out.println("skip");
            num1--;
            break;
		}
            System.out.println(num1);
            num1--;
		}

	}
	}

