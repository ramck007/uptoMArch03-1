import java.util.*;
import java.util.Scanner;
public class ExampleProgaram {
/*
 * company giving insurance to drivers
 * a.driver should be married 
 * b. if driver is unmarried and male above 30 years 
 * b. if driver is unmarried and female above 25 years
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter the Drivers age");
		int n = sc.nextInt();
		System.out.println("Enter the Drivers Gender Please give m or f");
		char c= sc.next().charAt(0);
		System.out.println("Enter the Drivers Status   Please give married or unmarried");
		String s= sc.next();
		if(s=="married") {
			System.out.println("You're eligible for Insurance");
		}
		else {
		//if(s=="unmarried") {
			if(c=='m') {
			if(n>=30) {
				System.out.println("You're eligible for Insurance");
			}
			else {
				System.out.println("Sorry You're not eligible for Insurance");
			}
			}
			else {
				if(n>=25) {
					System.out.println("You're eligible for Insurance");
				}else {
					System.out.println(" Sorry You're Not eligible for Insurance");
				}
			}
		}*/
		System.out.println("Enter the Drivers Status   Please give (m) married or (u) unmarried");
		//String s= sc.next();
		char s= sc.next().charAt(0);
		if(s=='m' || s=='M') {
			System.out.println("You're eligible for Insurance");
			
		}
		if(s=='u' || s=='U') {
		//else {
			System.out.println("So you're Unmarried..... cheers bruh.... Single");
			System.out.println("Enter the Drivers Gender Please give m or f");
			char c= sc.next().charAt(0);
			if(c=='m'|| c== 'M') {
				System.out.println("Enter the Drivers age");
				int n = sc.nextInt();
				if(n>=30) {
					System.out.println("You're eligible for Insurance");
				}
				else {
					System.out.println("Sorry bruh You're not eligible for Insurance");
				}
			}
			else {
				System.out.println("Enter the Drivers age");
				int n = sc.nextInt();
				if(n>=25) {
					System.out.println("You're eligible for Insurance");
				}
				else {
					System.out.println("Sorry Nambi You're not eligible for Insurance");
				}
			}
		}
		
		
		sc.close();
		}
	

}
