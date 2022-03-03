import java.util.*;
import java.util.Scanner;
public class EmployeeDetails {
	Scanner sc= new Scanner (System.in);
	public void printempdetails() {
		System.out.println("Employee ID:");
	}
	public int[]num(){
		int numb[]= new int[5];
		for(int i=0;i<5;i++) {
			numb[i]=sc.nextInt();
		}
		return numb;
	}
	
	public String[] details() {
	String det[]=new String[5];
	int n=5;
	for(int i=0;i<n;i++) {
		det[i]=sc.nextLine();
	}
	return det;
	}

}
