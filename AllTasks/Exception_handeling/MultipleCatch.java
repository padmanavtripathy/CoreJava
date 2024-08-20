package Exception_handeling;
import java.io.IOException;
import java.util.*;


public class MultipleCatch {
	public static void main(String...strings)
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of Employees :-");
		int a=sc.nextInt();
		System.out.println("Enter the Name of the Employee:- ");
		String arr[]=new String[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("The Name of the Employees are:- ");
		for(int i=0;i<a+2;i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("There somthing wrong in number format");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("There somthing wrong in index of array");
		}	
	}
}
