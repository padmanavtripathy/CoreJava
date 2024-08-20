package task_on_collection;
import java.util.*;


public class Question4 {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String...strings)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar= new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			ar.add(i);
		}
		ar.add(2);
		ar.add(5);
		ar.add(6);
		Question4 Q4=new Question4();
		String a="y";
		do
		{
			System.out.println("a)\tHow to Iterate ArrayList using Java ListIterator\r\n"
					+ "b)\tArraylist add element at specific index\r\n"
					+ "c)\tSort ArrayList in descending order\r\n"
					+ "d)\tinsert an element to ArrayList using ListIterator\r\n"
					+ "e)\tHsort arraylist of strings alphabetically java\r\n"
					+ "f)\tSort elements of Java ArrayList\r\n"
					+ "g)\treplace an element at specified index arraylist\r\n"
					+ "h)\tSearch an element of Java ArrayList\r\n"
					+ "i)\tRemove element from specified index ArrayList\r\n"
					+ "j)\tRemove duplicates from arraylist without using collections\n\n");
			
			System.err.println("Enter The Operetion wants to perform :- ");
			String choice=sc.next();
			switch(choice)
			{
				case "a":
					Q4.a(ar);
					break;
				case "b":
					Q4.b(ar);
					break;
				case "c":
					Q4.c(ar);
					break;
				case "d":
					Q4.d(ar);
					break;
				case "e":
					Q4.e(ar);
					break;
				case "f":
					Q4.e(ar);
					break;
				case "g":
					Q4.e(ar);
					break;
				case "h":
					Q4.h(ar);
					break;
				case "i":
					Q4.i(ar);
					break ;
				case "j":
					Q4.j(ar);
					break;
				default:
					System.err.println("!!!!!!---------Wrong Shoice--------!!!!!!!1");
					break;
					
			}
			System.err.println("Do you wants to continue----(y/n)-----??????");
			a=sc.nextLine();
		}while(a=="y");
	}
	
	
	
	
	
	public void a(ArrayList<Integer> ar)
	{
//		a)How to Iterate ArrayList using Java ListIterator
		ListIterator<Integer> itr=ar.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
		
	
	
	
	
	
	public void b(ArrayList<Integer> ar)
	{
//		b)Arraylist add element at specific index
		ar.add(1,113);
		System.out.println(ar);
	}
	
	
	
	
	
	
	public void c(ArrayList<Integer> ar)
	{
		
//		c)Sort ArrayList in descending order
		Collections.sort(ar);
		System.out.println(ar);
	}
	
	
	
	
	
	
	
	
	
	
	
	public void d(ArrayList<Integer> ar)
	{
//		d)insert an element to ArrayList using ListIterator
		ListIterator<Integer> itr1=ar.listIterator();
	}
	
	
	
	
	
	
	public void e(ArrayList<Integer> ar)
	{
//		e)sort arraylist of strings alphabetically java
		ArrayList<String> str= new ArrayList<String>();
		str.add("apple");
		str.add("bananna");
		str.add("Graps");
		Collections.sort(str);
		System.out.println(str);
	}
	
	
	
	
	
	
//	f)Sort elements of Java ArrayList	
	public void f(ArrayList<Integer> ar)
	{
		
	}
	
	
//	f)Sort elements of Java ArrayList	
	public void g(ArrayList<Integer> ar)
	{
			
		ar.set(1,34);
	}
		
	
	
	
	
//		h)Search an element of Java ArrayList
	public void h(ArrayList<Integer> ar)
	{
		System.out.println("Enter The Element to Search :- ");
		int a=sc.nextInt();
		for(Integer a1 :ar)
		{
			if (a1==a)
			{
				System.out.println("Match Found");
			}
		}
		
		//method-2
		if(ar.contains(a))
		{
			System.out.println("match Found");
		}
		else
		{
			System.out.println("Match Not found");
		}
	}
	
	
	
	
//		i)Remove element from specified index ArrayList
	public void i(ArrayList<Integer> ar)
	{
		System.out.println("Enter The Index to remove :- ");
		int a2=sc.nextInt();
		ar.remove(a2);
		System.out.println(ar);
	}
		
	
	
	
	
	
//		j)Remove duplicates from arraylist without using collections
	public void j(ArrayList<Integer> ar)
	{
		//ArrayList<Integer> al2=new ArryList<Integer>();
		
	}
}
