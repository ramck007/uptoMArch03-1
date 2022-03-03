import java.util.*;
public class JaggedArray {

	public static void main(String[] args) {
		
		int jaggedArray[][]=new int[4][];
		
		jaggedArray[0]=new int[] {1,2,3,4};
		jaggedArray[1]=new int[] {1};
		jaggedArray[2]=new int[] {1,2,3,4,7,8};
		jaggedArray[3]=new int[] {1,2,3};
		
		System.out.println("JaggedArray:\n");
		for(int i=0;i<jaggedArray.length;i++) {
			for(int j=0;j<jaggedArray[i].length;j++) {
				System.out.print(jaggedArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
