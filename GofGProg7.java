import java.util.*;
import java.util.Scanner;
public class GofGProg7 {
//		Sort the array of 0s, 1s, and 2s
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n =sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the Array element as 0s , 1s and 2s");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Sorted Array ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
