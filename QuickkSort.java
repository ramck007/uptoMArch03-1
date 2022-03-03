import java.util.*;

public class QuickkSort {
	
	
	public int pivt(int []arr,int start,int end) {
		
		int pivot=arr[end];
		int i=start-1;
		for(int j=start;j<=end-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[i]=t;
			}
		}
		int t=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=t;		
		return (i+1);
	}
	
	public void quick(int[] arr,int start,int end) {
		if(start<end) {
			int p=pivt(arr,start,end);
			quick(arr,start,p-1);
			quick(arr,p+1,end);
		}
	}
		
	public void printarr(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,18,27,2,19,25};
		int n= arr.length;
		System.out.println("Before Sorting");
		QuickkSort q=new QuickkSort();
		q.printarr(arr,n);
		q.quick(arr, 0, n-1);
		System.out.println("");
		System.out.println("After Sorting");
		q.printarr(arr,n);
	}
}
