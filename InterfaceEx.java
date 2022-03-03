import java.util.Scanner;

interface Animal1{
	
	  String s();
	
}
interface ani{
	int k();
}
class Dog1 implements Animal1{
	public String s() {
		 //System.out.println("White");
		return "White";
		 
	}
}

class Cat1 implements Animal1,ani{
	
public String s() {
		return "Black";
	}
public int k() {
	return 10;
}

}



public class InterfaceEx {
	
	public static void main(String[]args) {
		
		Animal1 A;
	A= new Dog1();
		System.out.println("Dog color is: "+ A.s());
		A = new Cat1();
Cat1 B= new Cat1(); 
		System.out.println("Cat color is: "+ A.s());
		System.out.println("Cat age is: "+ B.k());
	}

}
