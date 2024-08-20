package java8;
import java.util.*;
import java.util.stream.*;

class TerminalOperetions
{
	public void collectExample(List<Integer> li)
	{
		List<Integer> li2=li.stream().filter(x -> x%2==0).collect(Collectors.toList());
		System.out.println("After applying collect method with filter %2 ==0 is ");
		System.out.println(li2);
	}
	public void reduceExample(List<Integer> li)
	{
		int li2=li.stream().filter(x -> x%2==0).reduce(0, (ans,i) -> ans+i);
		System.out.println("After applying reduce() method  sum ");
		System.out.println(li2);
	}
	public void anyMatchExample(List<Integer> li)
	{
		boolean li2=li.stream().anyMatch(n -> n%2==0);
		System.out.println("Anymatch = "+li2);
	}
	public void noneMatchExample(List<Integer> li)
	{
		boolean li2=li.stream().noneMatch(n -> n%2==0);
		System.out.println("None match = "+li2);
	}
	public void allMatchExample(List<Integer> li)
	{
		boolean li2=li.stream().allMatch(n -> n%2==0);
		System.out.println("All match = "+li2);
	}
	public void forEachExample(List<Integer> li)
	{
		li.stream().forEach(System.out::println);
	}
	public void forEachOrderExample(List<Integer> li)
	{
		li.stream().forEachOrdered(System.out::println);
	}
}
public class Question1 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<20;i++)
		{
			li.add(i);
		}
			System.out.println("1.collect() 2.reduce() 3. anyMatch() 4.noneMatch() 5. allMatch()  6. forEach() 7.forEachOrdered()");
			System.out.println("Enter Your Choice ");
			int choice=sc.nextInt();
			TerminalOperetions to=new TerminalOperetions();
			switch(choice)
			{
			case 1:
				to.collectExample(li);
				break;
			case 2:
				to.reduceExample(li);
				break;
			case 3:
				to.anyMatchExample(li);
				break;
			case 4:
				to.noneMatchExample(li);
				break;
			case 5:
				to.allMatchExample(li);
				break;
			case 6:
				to.forEachExample(li);
				break;
			case 7:
				to.forEachOrderExample(li);
				break;
			default:
				System.out.println("Thank you");
			}
		
	}
}
