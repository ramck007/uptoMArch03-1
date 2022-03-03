import java.util.*;
interface Anial{
	void food(String f);
}
class Lion implements Anial
{@Override
	public void food(String f) {
		System.out.println("The lion eat : "+f);
		}
}
class Cow implements Anial
{@Override
	public void food(String c) {
		System.out.println("The Cow eat : "+c);
		}
}
class Elephant implements Anial
{@Override
	public void food(String e) {
		System.out.println("The elephant eat : "+e);
		}
}

public class BinarySearchEx{ //InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Lion o = new Lion();
		    o.food("meat");
		    Cow o1=new Cow();
		    o1.food("vegatables");
		    Elephant o2 =new Elephant();
		    o2.food("sugarcane");
		    }
		}










/*public class BinarySearchEx {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,12,13,14,15};
		int n=arr.length-1;
		int key=13;
		int min=0;
		int max=n;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==arr[mid]) {
				System.out.println("The Number is Present at index "+mid);
				break;
			}
			else if(key>arr[mid]) {
				min=mid-1;
			}
			else {
				max=mid+1;
			}
		}
		if(min>max) {
			System.out.println("OOPS..! The number is not present");
		}
	}

}*/
