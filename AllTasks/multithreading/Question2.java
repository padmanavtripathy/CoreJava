package multithreading;
import java.util.*;

class Thread11 extends Thread
{
	int a=2,b=3;
	public void run()
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Thread2 extends Thread
{
	int a=2,b=3;
	public void run()
	{
		int d=a+b/2;
		System.out.println(d);
	}
}
public class Question2 {
	public static void main(String[] args) {
		Thread11 T11=new Thread11();
		Thread2 T2=new Thread2();
		Thread t1=new Thread(T11);
		Thread t2=new Thread(T2);
		t1.start();
		try {
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
	}
}
