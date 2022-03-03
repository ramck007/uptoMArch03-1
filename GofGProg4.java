import java.util.*;
import java.util.Scanner;
public class GofGProg4 {
//		Write a program to sort the given array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Array Size");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The Sorted Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
