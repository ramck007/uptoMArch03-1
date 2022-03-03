import java.util.*;
class Salary2{
	double sal=50000;
}

class Bonus2 extends Salary2{
	double bon=15000;
	double m=sal+bon;
}

class Annual1 extends Salary2{
	
	double an=sal/10;
	//double ann=an+sal+bon;
}

public class HierarchicalInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonus b1=new Bonus();
		Annual a1=new Annual();
		
		System.out.println("Salary is Rs."+b1.sal);
		System.out.println("Bonus is Rs."+b1.bon);
		System.out.println("Yearly Increment Rs."+a1.an+"\n");
		System.out.println("Total Amount Rs."+(b1.sal+b1.bon+a1.an));

	}

}
