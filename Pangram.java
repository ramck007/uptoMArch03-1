import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="We promptly $judged antique ivory $&buckles for the next prize%"; /// A Dv
		//String s="Wepromptlyjudgedan#$tiqueivorybucklesforthenextprize";
		int n=s.length();
		boolean boo=false;
		//int flag=0;
		int count=0;
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			//if(c==)
			int k=c;
			//boolean boo=false;
			if((k>=65 && k<=90)||(k>=97 && k<=122) || c==' '){// || (c==' ')) {       //||k==0){
				boo=true;
			//	flag=1;
				//System.out.println("Pangram");
			}
			else{
				boo = false;
				//flag=0;
				count++;
				//break;
			//System.out.println("Not a Pangram");
			}
		}	
			if(boo) {
				System.out.println("Pangram"+count);
			}
			else {
				System.out.println("Not a Pangram"+count);
			}
		
		
	}

}
