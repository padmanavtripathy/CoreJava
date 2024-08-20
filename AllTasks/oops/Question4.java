/*4)Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of
arithmetic class.*/

interface test
{
	abstract void Square();
}
class arithmetic implements test
{
	private int length;
	private int breadth;
	@Override
	public void Square() {
		System.out.println("The area of the rectangle is:- "+length*breadth);
		
	}
	public void setsize(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}
public class Question4 {
	public static void main(String...strings)
	{
		arithmetic a=new arithmetic();
		a.setsize(3, 4);
		a.Square();
	}
}