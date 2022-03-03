import java.util.*;
class Car{
	String name;
	double price;
	public Car(String name) {
		this.name=name;
		System.out.println("Car name is "+this.name);
	}
	public Car(String name,double price) {
		this.name=name;
		this.price=price;
		System.out.println("Car name is "+this.name);
		System.out.println("Car price is "+this.price);
	}
	public void run() {
		System.out.println(name+" is running");
	}
}
public class SampleMultipleConstruct {
	public static void main(String[]args) {
	Car maruthi=new Car("Maruthi");
	maruthi.run();
	Car honda=new Car("Honda");
	honda.run();
	Car maruthiprice=new Car("Maruthi",55000);
	maruthiprice.run();
	Car hondaprice= new Car("Honda",75000);
	hondaprice.run();
		
		
	}

}



