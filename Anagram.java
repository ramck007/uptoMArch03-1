import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="peeK";
		String s2="keeP";
		int m=0,n=0;
		m=s1.length();										//  s1->m 
		n=s2.length();										//  s2->n
		if(n==m) {
			boolean res=false;
			for(int i=0;i<m;i++) {
				char c =s1.charAt(i);
				for(int j=0;j<n;j++) {
					char c1 =s2.charAt(j);
					if(c==c1) {
						res=true;
						break;
					}
				}	
			}
			if(res) {
				System.out.println("Its Anagram");
			}
			else{
				System.out.println("Its not a Anagram");
			}
		}
		else{
			System.out.println("Its not a Anagram");
		}
}

}
