import java.util.*;
public class StringBuilderEx {
	
	public static void main(String[]args) {
		
		StringBuilderEx sb = new StringBuilderEx();
		sb.joinwords();
	}

	private void joinwords() {
		// TODO Auto-generated method stub
		String[] name = {"hgfh","jhjh","gsgh","gashgas","gfsgh"};
		
		String sentence  = "";
		StringBuffer sbb = new StringBuffer("");
		StringBuffer sbb2 = new StringBuffer("raja");
		
		//thread safe  --->stringbuffer 
		// all methods are  synchronized methods
		
		//not thread safe --->stringbuilder
		//not all methods are synchronized
		StringBuilder sb = new StringBuilder("");
		sb.append("muthu");
		System.out.println(sb); 
		sb.insert(1, 'a');
		System.out.println(sbb); 
		sb.replace(0, 2, "ro");//including 0,excluding 2-->01
		System.out.println("After replacing:"+sb); 
		
		

		
		//System.out.println(sb);
	}

}
