import java.util.*;
import java.util.Scanner;
public class GofGProg10 {
//		Find the Union and Intersection of the two sorted arrays
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Arrays Size");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		System.out.println("Enter the First Array Element");
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Second Array Element");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
		//	if(b[i] instanceof a) {
				count++;
			//}
		}
	}

}
