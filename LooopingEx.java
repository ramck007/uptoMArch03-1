import java.util.*;
public class LooopingEx {

	public void ifConditionEx() {
		
		System.out.println("Enter your age: ");
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible for vote");			
		}
	}
	
	public void ifelseEx() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year: ");
		int n = sc.nextInt();
		if(n%4==0 || (n%100==0 && n%400==0)) {
			System.out.println("year "+ n + " is a leap year");
		}else {
			System.out.println("year "+ n + " is not a leap year");
		}
	}
	
	public void elseifEx() {
		System.out.println("Enter the mark: ");
		Scanner sc= new Scanner(System.in);
		float n= sc.nextFloat();
		if(n>=90 && n<=100) {
			System.out.println("Grade A");			
		}
		else if(n>=80 && n<=89) {
			System.out.println("Grade B");

		}
		else if(n>=70 && n<=79) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}
	
	public void nestedifEx() {
		
	}
	
	public void forEx() {
		// for loop
		System.out.println("Enter the limit: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		for(i=1;i<=n;i++) {
			System.out.println(i);
		} 

		// Enhaced for loop
		int numbers[]= {10,20,30,40,50,60,70};
		for(int j : numbers) {
			System.out.println(j);
		}
	}
	
	public void whileEx() {
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i= 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

	public void doWhileEx() {
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i= 1;
		//do_while
		do {
			System.out.println(i);
			i++;

		}while(i<=n);
	}
	
	
	public void switchEx() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LooopingEx lp = new LooopingEx();
		lp.ifConditionEx();
		lp.ifelseEx();
		lp.elseifEx();
		//lp.nestedifEx();
		lp.forEx();
		lp.whileEx();
		lp.doWhileEx();
		//lp.switchEx();
	}

}
