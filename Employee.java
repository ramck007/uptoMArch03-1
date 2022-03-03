import java.util.*;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		int n=5;
		EmployeeDetails emp = new EmployeeDetails();
		
		Sample1 test=new Sample1();
		
		StringInput strinp=new StringInput();
		
		int id[]=new int[5];
		String name[]=new String[5];
		int age []=new int[5];
		String gender[]=new String[5];
		String address[]=new String[5];
		
		System.out.println("Enter the Employee Id:");
		id=emp.num();
		System.out.println("Enter the Employee Name");
		//name=emp.details();
		//name=test.sName();
		name=strinp.stringinp();
		System.out.println("Enter the Employee Age");
		age=emp.num();
		System.out.println("Enter the Employee Gender");
		//gender=emp.details();
		gender=test.sName();
		System.out.println("Enter the Employee Address");
		//address=emp.details();
		address=test.sName();
		
		System.out.println("The Employess Details");
		for(int i=0;i<n;i++) {
			System.out.println("Employee Id: "+id[i]);
			System.out.println("Employee Name: "+name[i]);
			System.out.println("Employee Age: "+age[i]);
			System.out.println("Employee Gender: "+gender[i]);
			System.out.println("Employee Address: "+address[i]);
			System.out.println("\n");
			}
		}

}
