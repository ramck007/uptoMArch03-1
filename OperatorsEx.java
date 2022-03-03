import java.util.*;
public class OperatorsEx {
	
	public void arithmeticOp(){
		System.out.println("Arithmetic Operator Example");
		int a=125,b=25;
		System.out.println("Addition : " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		System.out.println("Madulus : " + (a%b));	
	}
	
	public void assignmentOp() {
		//Aritthmetic Assignment Operators
		//=        a=123       a=123
		//+=       a+=10       a=a+10
		//-=       a-=10       a=a-10
		//*=       a*=10       a=a*10
		///=       a/=10       a=a/10
		//%=       a%=10       a=a%10
		System.out.println("Assignment Operator Example");
			int a=123;
			System.out.println(a);
			a+=10;
			System.out.println(a);
			a-=10;
			System.out.println(a);
			a*=10;
			System.out.println(a);
			a/=10;
			System.out.println(a);
			a%=10;
			System.out.println(a);
	}
	
	public void bitwiseOp() {
		System.out.println("Bitwise Operator Example");
		int a=25,b=45;
		System.out.println("Bitwise And : "+ (a&b));
		System.out.println("Bitwise or : " + (a|b));
		System.out.println("Bitwise Xor : "+ (a^b));
		System.out.println("Bitwise Xor : "+ (~a));
	}
		
	public void logicalOp() {
		System.out.println("Logical Operator Example");
		int m1=25,m2=75;
		System.out.println("And && : "+ (m1>=35 && m2>=35));
		System.out.println("Or || : "+ (m1>=35 || m2>=35));
	}
	
	public void realtionalOp() {
		//Relational operator
		//==  equal to              a==b
		//!=  not equal to          a!=b
		//<   less than             a<b
		//>   greater than          a>b
		//<=  less than or equal to a<=b
		//>=  greater than or equal to a>=b
		System.out.println("Relational Operator Example");
		int a=100,b=50;
		System.out.println("Equal to : "+ (a==b));
		System.out.println("NotEqual to : "+ (a!=b));
		System.out.println("Less than : "+ (a<b));
		System.out.println("Greater than : "+ (a>b));
		System.out.println("Less than or Equal to : "+ (a<=b));
		System.out.println("Greater than or Equal to : "+ (a>=b));
	}
	
	public void ternaryOp() {
		System.out.println("Ternary Operator Example");
		int a=55,b=35,c;
		c=a>b?a:b;
		System.out.println("The greatest number is : "+c);	
	}
	
	public void unaryOp() {
		System.out.println("Unary Operator Example");
		int a=10;
		System.out.println(a);
	//	a++;  //a=a+1
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorsEx op=new OperatorsEx();
		op.arithmeticOp();
		op.assignmentOp();
		op.bitwiseOp();
		op.logicalOp();
		op.realtionalOp();
		op.ternaryOp();
		op.unaryOp();
	}

}
