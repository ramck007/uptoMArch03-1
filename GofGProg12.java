import java.util.*;
import java.util.Scanner;
public class GofGProg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Array Size");
		 int n=sc.nextInt();
		int arr[]=new int[n];
		 System.out.println("Enter the Array Elements");
		 int asum=0;
		 for(int i=1;i<=n-1;i++) {
			//asum+=arr[i];
			arr[i]=sc.nextInt();
		 }
		 int sum=0;
		 sum=n*(n+1)/2;
		// for(int i=1;i<=n;i++) {
		//	 sum+=i;
		// }
		 for(int i=1;i<=n-1;i++) {
			 asum+=arr[i];
		 }
		 System.out.println(sum-asum);
	}

}
