import java.util.Scanner;
public class enumEx {
	
	public enum weak{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATERDAAY
	}
	
	public static void main(String[]args) {
		
		for(weak w : weak.values()) 
			
			System.out.println(w);
		
		System.out.println("Index of SUNDAY is: "+weak.valueOf("SUNDAY").ordinal());  
		System.out.println("Index of THURSDAY is: "+weak.valueOf("THURSDAY").ordinal()); 
		
	weak w= weak.FRIDAY;
	System.out.println(w);
	
	}
	
	 
	}




