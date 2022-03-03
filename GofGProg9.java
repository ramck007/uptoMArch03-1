import java.util.*;
import java.util.Scanner;
public class GofGProg9 {
// Move all the negative elements to one side of the array
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Size ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0,k=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				arr2[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(arr2[i]+" ");
		}
		for(int a=0;a<j;a++) {
			System.out.print(arr1[a]+" ");
		}
		//for(int i:arr1) { System.out.print(i+" "); }
		//for(int i:arr2) { System.out.print(i+" "); }
		
		
	}

}
