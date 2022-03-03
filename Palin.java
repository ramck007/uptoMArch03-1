import java.util.*;
public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Happy Palindrome Day - 22-02-2022\n");
	long a=22022022;
	long c=a;
	long b=0;
	while(a!=0) {
		long temp= (a%10);
		b=b*10+temp;
		a=a/10;
	}
	if(c==b) {
		System.out.println("Its a Palindrome Day");
	}
	else {
		System.out.println("OOPs Its not a Palindrome Day");
	}
	}

}
