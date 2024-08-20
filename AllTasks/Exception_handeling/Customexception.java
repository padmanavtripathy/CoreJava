package Exception_handeling;
import java.util.*;


class HighersizeException extends Exception
{
	public HighersizeException(String str)
	{
		super(str);
		//System.out.println(str);
	}
}


public class Customexception {
	public void initialize(int size) throws HighersizeException
	{
		if(size >10)
		{
			throw new HighersizeException("Size is too high");
		}
		else
		{
			String[] str=new String[size];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Name of the Student :- ");
			for(int i=0;i<size;i++)
			{
				str[i]=sc.nextLine();
			}
		}
	}
	
	public static void main(String...strings)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter The Total number of Students :- ");
		int size=sc.nextInt();	
		Customexception ce=new Customexception();
		ce.initialize(size);
		}
		catch(HighersizeException ex)
		{
			System.out.println("Exception "+ex);
		}
	}
	
}
