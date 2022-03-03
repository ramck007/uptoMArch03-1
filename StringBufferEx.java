import java.util.*;
public class StringBufferEx {
	
	public static void main(String[]args) {
		
		StringBufferEx sb = new StringBufferEx();
		sb.joinwords();
	}

	private void joinwords() {
		// TODO Auto-generated method stub
		String[] name = {"hgfh","jhjh","gsgh","gashgas","gfsgh"};
		String sentence  = "";
		StringBuffer sbb = new StringBuffer("");
		StringBuffer sbb2 = new StringBuffer("raja");
		sbb2.insert(1, 'a');
		System.out.println(sbb2); 
		
		sbb2.replace(0, 2, "ro");//including 0,excluding 2-->01
		System.out.println("After replacing:"+sbb2); 
		
	
		System.out.println(sbb2.reverse());

		
		for(String names : name) {
			
			//adding at end-->append
			sbb.append(names);
			//System.out.println("String buffer hashcode:"+sbb.hashCode());
			sentence = sentence+names+" ";
			//System.out.println("String hashcode:"+sentence.hashCode());

			
		}
		System.out.println(sbb);
		System.out.println(sentence);
	}

}
