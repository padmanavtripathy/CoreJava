package task_on_collection;
import java.util.*;
class Function
{
	public String[] sort()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Size Of The Array :- ");
		int size=Sc.nextInt();
		String str[]=new String[size];
		System.out.println("Enter The Strings :- ");
		for(int i=0;i<size;i++)
		{
			str[i]=Sc.next();
		}
		Arrays.sort(str);
		return str;
	}
	public String[] Ordering(String str[],int n)
	{
		if(str.length %2 == 0)
		{
			for(int j=0;j<n/2;j++)
			{
				str[j]=str[j].toUpperCase();
			}
			for(int j=n/2;j<n;j++)
			{
				str[j]=str[j].toLowerCase();
			}
		}
		else
		{
			for(int j=0;j<=n/2;j++)
			{
				str[j]=str[j].toUpperCase();
			}
			for(int j=n/2+1;j<n;j++)
			{
				str[j]=str[j].toLowerCase();
			}

		}
		return str;
	}
}
public class Question18 {
	public static void main(String[] args) {
		Function f1=new Function();
		String str[]=f1.sort();
		System.out.println("After sorting ");
		for(String s:str)
		{
			System.out.println(s);
		}
		str=f1.Ordering(str,str.length);
		System.out.println("After Complete");
		for(String s:str)
		{
			System.out.println(s);
		}
	}
}
