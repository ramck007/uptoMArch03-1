import java.util.Scanner;

abstract class Animal{
	abstract String s();
}

class Dog extends Animal{
	 String s() {
		 return "White";
		 }
}

class Cat extends Animal{
	String s() {
		return "Black";
	}
}

public class AbstractEx {
	
	public static void main(String[]args) {
		
		Animal A;
		A= new Dog();
		System.out.println("Dog color is: "+ A.s());
		A = new Cat();
		System.out.println("Cat color is: "+ A.s());

	}

}



