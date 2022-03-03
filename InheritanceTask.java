import java.util.*;

class Bank{
	Bank(){
		System.out.println("Rate of Interst ");
	}
	float rateofInterest() {
		return 9;
	}
}

class IOB extends Bank{
	float rateofInterest() {
		return 9.5f;
	}
}

class SBI extends Bank{
	float rateofInterest() {
		return 9.9f;
	}
}

public class InheritanceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank a=new IOB();
		System.out.println("IOB - "+a.rateofInterest());
		Bank b=new SBI();
		System.out.println("SBI - "+b.rateofInterest());
	}

}
