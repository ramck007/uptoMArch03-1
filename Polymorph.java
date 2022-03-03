import java.util.*;
class Poly{
	Poly(){
		System.out.println("Example for Method overloading \n");
	}
	public void add()
	{
		System.out.println("Without argument is Called");
	}
	public void add(int a ,int b) {
		System.out.println("With argument is Called");
	}
	public void add(int a ,int b,int c) {
		System.out.println("With argument 3 is Called");
	}
}
class Poly1 extends Poly{
	Poly1(){
		System.out.println("Example for Method OverRiding \n");
	}
	public void add()
	{
		System.out.println("Without argument 1 is Called");
	}
	public void add(int a ,int b) {
		System.out.println("With argument 1 is Called");
	}
	public void add(int a ,int b,int c) {
		System.out.println("With argument 3  1 is Called");
	}
}
public class Polymorph {
public static void main(String[] args) {
		Poly1 pl= new Poly1();
		pl.add();
		pl.add(3, 2);
		pl.add(5,3,7);
	}
}
