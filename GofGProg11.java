import java.util.*;
import java.util.Scanner;
public class GofGProg11 {
//    Write a program to cyclically rotate an array by one
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n= sc.nextInt();
		System.out.println("Enter the array Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		System.out.print(arr[n-1]+" ");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
