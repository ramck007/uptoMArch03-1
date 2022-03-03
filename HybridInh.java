import java.util.*;
class Salary3{
	double sal=50000;
}

class Bonus3 extends Salary3{
	double bon=15000;
	double m=sal+bon;
}

class Annual2 extends Salary3{
	
	double an=sal/10;
	//double ann=an+sal+bon;
}

class AdditionalBonus extends Bonus3{
	double bonn=10000; 
}

public class HybridInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionalBonus ab=new AdditionalBonus();
		Annual2 a2 = new Annual2();
		System.out.println("Salary is Rs."+ab.sal);
		System.out.println("Bonus is Rs."+ab.bon);
		System.out.println("Yearly Increment Rs."+a2.an);
		System.out.println("Extra Additional Bonus Rs."+ab.bonn+"\n");
		System.out.println("Total Amount Rs."+(ab.sal+ab.bon+a2.an+ab.bonn));

	}

}
