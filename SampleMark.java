import java.util.*;
import java.util.Scanner;
public class SampleMark {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//int n=5;
		Mark mark=new Mark();
		Sample1 sam=new Sample1();
		int a[]=new int[5];
		String b[]=new String[5];
		int c[]=new int[5];
		int d[]=new int[5];
		int e[]=new int[5];
		int f[]=new int[5];
		int g[]=new int[5];
		System.out.println("Enter the Roll No");
		a=mark.rl();
		System.out.println("Enter the Name");
		b=sam.sName();
		System.out.println("Enter the Tamil Mark");
		c=mark.rl();
		System.out.println("Enter the Maths Mark");
		d=mark.rl();
		System.out.println("Enter the Science Mark");
		e=mark.rl();
		f=mark.tot(c,d,e);
		g=mark.avg(c,d,e);
		System.out.println("The Marks and avg are");
		System.out.println("R.N Name   Marks   ToT  Avg");
		for(int i=0;i<5;i++) {
			//System.out.println(b[i]);
		System.out.print(a[i]+". "+" "+b[i]+"   "+c[i]+" "+d[i]+" "+e[i]+"  "+f[i]+"  "+g[i]);//+" "+c[i]);
		System.out.println("");
		}
	}

}
