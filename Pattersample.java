import java.util.*;
public class Pattersample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==i||i==1||i==5||j==1||j==5||(i==2&&j==2*i)||(i==4&&j==i/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	
	}

}
