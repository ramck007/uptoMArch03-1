import java.util.Scanner;
public class Mark{
	Scanner sc= new Scanner(System.in);
	public int[] rl() {
		int r[]=new int[5];
		for(int i=0;i<5;i++) {
			r[i]=sc.nextInt();
		}
		return r;
		}
	public int[] tot(int []a,int[]b,int[]c) {
		int to[]=new int[5];
		for(int i=0;i<5;i++) {
			to[i]=(a[i]+b[i]+c[i]);
		}
		return to;
	}
	public int[] avg(int []a,int[]b,int[]c) {
		int av[]=new int[5];
		for(int i=0;i<5;i++) {
			av[i]=(a[i]+b[i]+c[i])/3;
		}
		return av;
	}
	
	
		/*public String[] sName() {
			String[] s=new String[2];
			for(int i=0;i<=2;i++) {
				s[i]=sc.nextLine();
			}
			return s;
	}*/
		/*public int[] mk() {
			int m[]=new int[2];
			for(int i=0;i<2;i++) {
				m[i]=sc.nextInt();
			}
			return m;
			}*/
	
}
