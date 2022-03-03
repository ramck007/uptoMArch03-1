import java.util.*;
import java.util.Scanner;
public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Id,Age;
		String Name,Gender,Address;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Employee Id:");
		Id=sc.nextInt();
		System.out.println("Enter the Employee Name:");
		Name=sc.next();
		System.out.println("Enter the Employee Age:");
		Age=sc.nextInt();
		System.out.println("Enter the Employee Gender:");
		Gender=sc.next();
		System.out.println("Enter the Employee Address:");
		Address=sc.next();
		
		Employee2 emp = new Employee2();
		emp.printEmpDetails(Id,Name,Age,Gender,Address);
	}

}
