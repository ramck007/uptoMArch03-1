import java.util.*;

class Salary{
	double sal=50000;
}

class Bonus extends Salary{
	double bon=15000;
	double m=sal+bon;
	
}

public class SingleInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonus b = new Bonus();
		System.out.println("Salary is Rs."+ b.sal +"\n");
		System.out.println("Salary plus Bonus Rs."+ b.m);
	}

}
