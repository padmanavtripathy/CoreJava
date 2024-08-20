package task_on_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product2 implements Comparable<Product2>
{
	String Name;
	int price;
	
	public Product2(String Name,int price)
	{
		this.Name=Name;
		this.price=price;	
	}
	
	public int compareTo(Product2 p)
	{
		if (price == p.price)
		{
			return 0;
		}
		else if(price>p.price)
		{
			return 1;
		}
		else
			return -1;
	}
	
	public String toString()
	{
		return 	"Name = "+this.Name+"Price = "+this.price;
	}
}
public class Task3 {
	public static void main(String...strings)
	{
		String name[]= {"Orbital Keys","XPress Bottle","InstaPress","Uno Wear","Swish Wallet","Vortex Bottle","Gymr Kit","Villafy","Snap It","Pen"};
		int price[]= {30,56,67,24,12,45,58,98,34,10};
		
		ArrayList<Product2> p2=new ArrayList<Product2>();
		for(int i=0;i<price.length;i++)
		{
			p2.add(new Product2(name[i],price[i]));
		}
		System.err.println("Before Sorting---------");
		String str=p2.toString();
		System.out.println(str);
		
		System.err.println("\nAfter Sorting-----------");
		Collections.sort(p2);
		String str2=p2.toString();
		System.out.println(str2);
	}
}
