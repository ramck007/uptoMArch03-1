import java.util.*;

class Salary1{
	double sal=50000;
}

class Bonus1 extends Salary1{
	double bon=15000;
}

class Annual extends Bonus1{
	double m=sal+bon;
	double an=sal/10;
	double ann=an+sal+bon;
}

public class MultilvlInh {

	public static void main(String[] args) {
	Annual a=new Annual();
	System.out.println("Salary is Rs."+a.sal);
	System.out.println("Bonus is Rs."+a.bon);
	System.out.println("Yearly increment is Rs."+a.an+"\n");
	System.out.println("Total Amount Rs."+a.ann);
	}

}
