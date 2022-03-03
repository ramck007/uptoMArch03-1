import java.util.*;
import java.util.Scanner;
public class StringInput {
	Scanner sc= new Scanner(System.in);

	public String[] stringinp() {
		String si[]=new String[5];
		for(int i=0;i<5;i++) {
		si[i]=sc.nextLine();
		}
		return si;
	}
}
