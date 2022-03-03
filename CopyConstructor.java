import java.util.*;
import java.util.Scanner;

class CC{
	int real, img;
	
	public CC(){
	this.real=5;
	this .img=10;
		
	}
	public CC(int a,int b) {
		this.real=a;
		this .img=b;
	}
	public CC(CC cc2) {
		this.real=cc2.real;
		this.img=cc2.img;
	}
	
	public String toString() {
		
		return "(" +real + "+" + img +"i)";
	}
}
public class CopyConstructor {
	
public static void main(String[] args) {
	
	CC cc1= new CC();
	
	CC cc2= new CC(3,7);
	
	CC cc3= new CC(cc2);
	
	System.out.println(cc1);
	System.out.println(cc2);
	System.out.println(cc3);
	
}
}
