import java.util.*;
import java.util.Scanner;
public class GofGProg6 {
//		Find the occurrence of an integer in the array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n= sc.nextInt();
		System.out.println("Enter the Array Element");
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to check Occurance");
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		System.out.println("The Element to check Occurance "+k+" is "+count);

	}

}
