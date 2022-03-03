import java.util.*;
import java.util.Scanner;
public class BubbleSortEx {

	public int[] BubbSort(int []arr){
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public void searchh(int[] arr) {
		int n=arr.length-1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to find");
		int key=sc.nextInt();
		int min=0;
		int max=n;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==arr[mid]) {
				System.out.println("The Number is Present at index "+mid);
				break;
			}
			else if(key>arr[mid]) {
				min=mid-1;
			}
			else {
				max=mid+1;
			}
		}
		if(min>max) {
			System.out.println("OOPS..! The number is not present");
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr= {15,13,14,11,12,10};
		//int n=arr.length;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the quantity of elements to be sorted using Bubble Sort");
		int n= sc.nextInt();
		System.out.println("Enter the Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
		}
		System.out.println("Elements before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		BubbleSortEx bs=new BubbleSortEx();
		bs.BubbSort(arr);

		System.out.println("Elements after Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		bs.searchh(arr);
	}

}
