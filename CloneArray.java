import java.util.*;
public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,2,3,4,5};
		int m[]=n.clone();
		System.out.println("First case using clone");
		System.out.println(n==m);
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println("");
	//	int a[]= {5,4,3,2,1};
		int b[]=n;
		System.out.println("Second case without using clone");
		System.out.println(n==b);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
