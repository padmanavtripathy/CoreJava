//Ques 1.Consider a cell phone where you save your Contacts. Suppose a person has two contact numbers. For the ease of accessibility,
//your cell phone provides you the functionality where you can save two or more numbers under the same name. use polymorphism concept in this scenario

import java.util.*;

class person
{
	public String name;
	long mob_no1;
	long mob_no2;
	long mob_no3;
	person(String name,long mob1)
	{
		this.name=name;
		this.mob_no1=mob1;
	}
	person(String name,long mob1,long mob2)
	{
		this.name=name;
		this.mob_no1=mob1;
		this.mob_no2=mob2;
	}
	person(String name,long mob1,long mob2,long mob3)
	{
		this.name=name;
		this.mob_no1=mob1;
		this.mob_no2=mob2;
		this.mob_no3=mob3;
	}
}
public class Question1 {
	public static void main(String...strings)
	{
		Scanner sc=new Scanner(System.in);
		Long[] arr=new Long[3];
		System.out.println("Enter The Person name : - ");
		String name=sc.nextLine();
		System.out.println("Enter The Number of Contacts The person have :-");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			int j=i+1;
			System.out.println("Enter The "+j+" th number of the person:- ");
			arr[i]=sc.nextLong();
		}
		switch(no) {
		case 1:
			person p1=new person(name,arr[0]);
			break;
		case 2:
			person p2=new person(name,arr[0],arr[1]);
			break;
		case 3:
			person p3=new person(name,arr[0],arr[1],arr[2]);
			break;
		}	
	}		
}
