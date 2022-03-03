import java.util.*;
import java.util.Scanner;
public class GofGProg2 {
//		Find the minimum and maximum element in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Array Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Number");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[n];
		arr1=arr;
		Arrays.sort(arr1);
		System.out.println("Minimum Element in the given Array is "+arr1[0]);
		System.out.println("Maximum Element in the given Array is "+arr1[n-1]);
		int min=arr[0],max=0;
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Element in the given Array is "+min);
		System.out.println("Maximum Element in the given Array is "+max);
	}

}
