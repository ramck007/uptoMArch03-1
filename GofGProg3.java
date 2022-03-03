import java.util.*;
import java.util.Scanner;
public class GofGProg3 {
	//Write a program to reverse the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		System.out.print("The Reversed String is ");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
