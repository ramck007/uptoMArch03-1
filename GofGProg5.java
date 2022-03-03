import java.util.*;
import java.util.Scanner;
public class GofGProg5 {
	// Find the Kth largest and Kth smallest number in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array Elements");
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Kth Element");
		int k=sc.nextInt();
		arr1=arr;
		Arrays.sort(arr1);
		//for(int i:arr1) {System.out.print(i);}
		System.out.println(k+"th Smallest element is "+arr1[k-1]);
		System.out.println(k+"th Largest element is "+arr1[n-k]);
		
		/*int min=0,max=arr[0],count1=1,count2=1;
		for(int i=0;i<n;i++) {
			if(min>arr[i] && count1<=k) {
				min=arr[i];
				count1++;
			}
			if(max<arr[i] && count2<=k) {
				max=arr[i];
				count2++;
			}
		}
		System.out.println(min+" "+max);*/
}}
