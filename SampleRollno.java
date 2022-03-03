import java.util.Scanner;
class Student{
	Student (int n){
		int m=n;
	}
	Scanner sc= new Scanner(System.in);
	public void rollno(int m) {
		int ar[]=new int[m];
		for(int i=0;i<m;i++) {
			ar[i]=sc.nextInt();
		}
		////public void prin(int[]ar ,int m) {
			for(int i=0;i<m;i++) {
				System.out.println(ar[i]);
			}}}
public class SampleRollno  {
	
	public static void main(String[]args) {
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Student s= new Student(n);
		s.rollno(n);
		//s.prin(int []ar, n);
		}
}

