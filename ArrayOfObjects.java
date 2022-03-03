import java.util.*;
class Students{
	public int rollno;
	public String name;
	Students(int rollno,String name){
		
		this.rollno=rollno;
		this.name=name;
	}
	
	void print() {
		
		System.out.println("Name     : "+name);
		System.out.println("Roll No     : "+rollno);
		
		System.out.println("----------------------------------");


	}
}
public class ArrayOfObjects {
	
	public static void main(String[] args) {
		
		Students[] ob=new Students[5];
		//ob = new Students[5];
		ob[0]=new Students(10,"Ram");
		ob[1]=new Students(28,"Sam");
		ob[2]=new Students(45,"Ravi");
		ob[3]=new Students(50,"Kumar");
		ob[4]=new Students(23,"Vijay");
		for(int i=0;i<ob.length;i++) {
			
		ob[i].print();

		}
	}

}
