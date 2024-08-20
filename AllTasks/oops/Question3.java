/*3)Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named area() and perimeter(). Create these using polymorphism concepts.*/


abstract class shape
{
	protected double  area;
	protected double perimeter;
	abstract double getarea();
	abstract double getperimeter();
	
}

class circle extends shape
{

	public void area(double redious)
	{
		area= 3.14*redious*redious;	
	}
	public void perimeter(double redious)
	{
		perimeter=2*3.14*redious*redious;
	}
	@Override
	double getarea() {
		return this.area;
	}
	@Override
	double getperimeter() {
		return this.perimeter;
	}	
}

class triangle extends shape
{
	public void area(double height,double base)
	{
		area=0.5*height*base;
	}
	public void perimeter(double a,double b,double c)
	{
		perimeter= a+b+c;
	}
	@Override
	double getarea() {
		return this.area;
	}
	@Override
	double getperimeter() {
		return this.perimeter;
	}
}

class square extends shape
{
	public double area(double length,double breadth)
	{
		return length*breadth;
	}
	public double perimeter(double length,double breadth)
	{
		return 2*(length+breadth);
	}
	@Override
	double getarea() {
		return this.area;
	}
	@Override
	double getperimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Question3 {
	public static void main(String...strings)
	{
		circle c=new circle();
		c.perimeter(2);
		System.out.println("Perimeter of the circle is :- "+c.getperimeter());
		
		
		triangle t=new triangle();
		t.area(4, 5);
		System.out.println("Area of the Triangle is :- " + t.getarea());
		
		square s=new square();
		s.area(2,4);
		System.out.println("Area of the Triangle is :- " +s.getarea());	
	}
}
