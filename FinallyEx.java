import java.util.Scanner;
class finalExample {
	
	final int age =18;
	void display() {
		System.out.println(age);
		//compile time error
	//age = 55;
	}
}

public class FinallyEx{
	
	public static void main(String[]args) {
	finalExample fe=new finalExample();
	fe.display();
		try {
			System.out.println("inside try block");
			int data = 25/0;
			System.out.println(data);
			
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("exception handled");
	System.out.println(e);
	
	
		}
		  finally {  
		        System.out.println("finally block is always executed");  
		      }    
		      System.out.println("rest of the code");    
	}
}

