import java.util.*;
import java.util.Scanner;
public class GofGProg13 {
//    	Count Pairs with given sum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Array Size");
		int n= sc.nextInt();
		System.out.println("Enter the Subarray Sum");
		int sum=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	//	int r1=0,r2=0;
		int k=0,count=0;
		for(int i=0;i<n;i++) {
			k=arr[i];
			for(int j=i+1;j<n;j++) {
				k+=arr[j];
				if(k==sum) {
					count++;
					//r1=i+1;
					//2=j+1;
					//System.out.print(r1+" "+r2);System.out.println("");
			}
			
		}
			System.out.println(count);
		/*for(int i=0;i<n;i++) {
			 k=arr[i];
			int a=0;
			for(int j=i+1;j<n;j++) {
				 a+=arr[j];
				if(k+a==sum) {
					r1=i;
					r2=j;
					System.exit(r1);
				}
			}
		}
		
		System.out.print(r1+" "+r2);
		*/
	}
	}
}


