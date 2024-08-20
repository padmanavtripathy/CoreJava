package task_on_collection;
import java.util.*;
class Product
{
	String name;
	int price;
	
	public Product(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return 	"Name = "+this.name+"Price = "+this.price;
	}
}

class Sortbyprice implements Comparator<Product>
{

	public int compare(Product product1, Product product2) {
		return product1.price - product2.price;
	}
	
}
public class Task {
	public static void main(String...strings)
	{
		String name[]= {"Orbital Keys","XPress Bottle","InstaPress","Uno Wear","Swish Wallet","Vortex Bottle","Gymr Kit","Villafy","Snap It","Pen"};
		int price[]= {30,56,67,24,12,45,58,98,34,10};
		
		ArrayList<Product> p1=new ArrayList<Product>();
		for(int i=0;i<price.length;i++)
		{
			p1.add(new Product(name[i],price[i]));
		}
		System.err.println("Before Sorting---------");
		String str=p1.toString();
		System.out.println(str);
		
		System.err.println("After Sorting-----------");
		Collections.sort(p1, new Sortbyprice());
		String str2=p1.toString();
		System.out.println(str2);
	}
}
