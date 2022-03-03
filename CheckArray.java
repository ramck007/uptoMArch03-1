import java.util.*;

public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,5,5,3};			// 2 3 5 5 7 
		int brr[]= {7,2,5,4,6,3,5,3};  // 2 3 3 4 5 5 6 7 
		int crr[];
		int m=0,n=0;
		Arrays.sort(arr);
		Arrays.sort(brr);
		m=arr.length;
		n=brr.length;
		for(int i=0;i<n;i++) {// i-> brr
			int k=brr[i];
			boolean  res=false;
			for(int j=0;j<m;j++) { // j=>arr
				if(k==arr[j]) {    //
					res= true;
					break;
				}
				//else if(k!=arr[j]) {
				//else {
				//	System.out.println(k);
				//	res=k;
					
			//	}
			}
			//System.out.print(res);
			if(!res) {
				System.out.print(k+" ");
			}
		}

	}

}
