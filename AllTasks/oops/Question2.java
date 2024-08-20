 /*2.Suppose you went to a Shopping Centre (Allen Solly) near your home and bought a pair of jeans. A week later, while traveling to a nearby town,
you spot another Shopping centre. You walk into the shop and find a new variant of the same brand which you liked even more. But you decided to buy it from the shop near to your home.
Once back home, you again went to the Shopping Centre near your home to get those amazing pair of Jeans but couldn't find it. Why?
Because that was a specialty of the shop that was located in the neighbouring town. use polymorphism concept in this scenario
class Shoping_center */

abstract class Allen_Solly
{
	protected String product1="Jeans";
	protected String product2="Shirts";
	abstract public void show_products();
	
	
}
class shop1 extends Allen_Solly
{
	public void show_products()
	{
		System.out.println("The products avalable at local shop is :-    \n\n\t1.  "+product1+"           \t2."+product2);
	}
}
class shop2 extends Allen_Solly
{
	private String product3="new_barnds";
	public void show_products()
	{
	System.out.println("\n\n\n\nThe products avalable at local shop is :-    \n\n\t1.  "+product1+"           \t2."+product2+"               \t3."+product3);
	}
}
public class Question2 {
	public static void main (String...strings)
	{
		shop1 s1=new shop1();
		s1.show_products();
		shop2 s2= new shop2();
		s2.show_products();
	}
}
