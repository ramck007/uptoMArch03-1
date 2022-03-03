import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.Scanner;
 class User implements Serializable{
	public String userName;
	transient String password;
}
public class ExampleTransient {
	
	public static void main(String[]args) throws IOException,ClassNotFoundException{
	User savedUser=new User();
	savedUser.userName="John";
	savedUser.password="my-password";
	
	ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file1"));
	outputStream.writeObject(savedUser);

	ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file1"));
	User retrievedUser = (User) inputStream.readObject();
	
	System.out.println("retrived user name :"+retrievedUser.userName);
	System.out.println("retrived password :"+retrievedUser.password);
	}

}


