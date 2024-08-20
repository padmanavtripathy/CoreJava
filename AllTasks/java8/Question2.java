package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InterMidieteOperetion
{
	public void distinctExample(List<Integer> li)
	{
		li.stream().distinct().forEach(System.out::println);
	}
	public void limitExample(List<Integer> li)
	{
		li.stream().limit(2).forEach(System.out::println);
	}
	public void peekExample(List<Integer> li)
	{
		li.stream().distinct().forEach(System.out::println);
	}
	public void skipExample(List<Integer> li)
	{
		li.stream().skip(2).forEach(System.out::println);
	}
	
}
public class Question2 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<20;i++)
		{
			li.add(i);
		}
		li.add(4);
		li.add(6);
		System.out.println("1.distinct() 2.limit() 3.skip() 4. peek() 5.flatMap()");
		System.out.println("Enter Your Choice ");
		int choice=sc.nextInt();
		InterMidieteOperetion im=new InterMidieteOperetion();
		switch(choice)
		{
		case 1:
			im.distinctExample(li);
			break;
		case 2:
			im.limitExample(li);
			break;
		case 3:
			im.peekExample(li);
			break;
		case 4:
			im.skipExample(li);
			break;
		default:
			System.out.println("Thank you");
		}
	}
}
