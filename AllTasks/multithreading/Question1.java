package multithreading;
import java.util.*;
class Thread1 extends Thread
{
	public void run()
	{
		 System.out.println("Java is hot");
		 System.out.println("Java is aromatic");
		 System.out.println("Java is invigorating");
	}
}
public class Question1 {
	public static void main(String[] args) {
		Thread1 T1=new Thread1();
		Thread t1=new Thread(T1);
		Thread t2=new Thread(T1);
		t1.start();
		t2.start();
	}
}