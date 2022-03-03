import java.util.*;
public class StringExample2 {
	
	String name;
    public StringExample2(String s) {
    
    this.name = name;
  }
    
	public static void main(String[]args) {
		
		StringExample2 se = new StringExample2("adaikalaa ruban");
	    se.countofvowels();
		se.countofwwords();
		se.countofsentence();
		//se.joinwords();
	}
	
	private void joinwords() {
		
	String[] names = {"vini","mani","kani","pani"};
	
//	for(int i=0;i<names.length;i++) {
//		System.out.print(names[i]+" ");
//	}
	String sentence ="";
	
	//unidirectional loop
	for(String name :names) {
		//System.out.print(name+" ");
		sentence+=name+" ";
		//sentence = sentence+name+" ";
	}
	System.out.println(sentence);
	}

	
	private void countofsentence() {
		
		String s="muthu ";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.contains("l"));
		System.out.println(s.endsWith("thu "));
		System.out.println(s.startsWith("mu"));
		
		String s3 = s.trim();
		System.out.println(s3);		
		System.out.println(s3.length());
		System.out.println(s3.endsWith("thu"));
		
		String s2 = "this is my program. i will give you today. my email id is muthu@gmail.com. ";
		int count =0;
		int i =0;
		for( i=0;i<s2.length();i++) {
			
			if(s2.charAt(i)=='.')
				if(s2.charAt(i+1)==' ')
				count++;
		}
		System.out.println("No of countsentence: "+ count);
	}

	private void countofwwords() {
		
		String s="muthu";
		String s2 = "muthu ram";
		int count =1;
		int i =0;
		for( i=0;i<s2.length();i++) {
			if(s2.charAt(i)==' ')
				count++;
		}
		System.out.println("No of countwords: "+ count);
}
	
	private void countofvowels() {
		// TODO Auto-generated method stub
		String s = new String("Adaikalaa ruban");
		//System.out.println(s.length());
		int i=0;
		int count =0;
		s=s.toLowerCase();

		for(i=0;i<s.length();i++) {

			char ch = s.charAt(i);
		switch(ch) {
		
		case 'a' :
			count++;
			break;
		case 'e':
			count++;
			break;
		case 'i':
			count++;
			break;
		case 'o':
			count++;
			break;
		case 'u':
			count++;
			break;
		}
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
// count++;
//				
//			}
		//	System.out.println(ch);
		}
		System.out.println("No of vowels: "+ count);
	
		
	}

}
