import java.util.*;
import java.util.Scanner;
class NestedClassEx{  
	  static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
		  NestedClassEx.Inner obj=new NestedClassEx.Inner();  
	  obj.msg();  
	  }  
}  
