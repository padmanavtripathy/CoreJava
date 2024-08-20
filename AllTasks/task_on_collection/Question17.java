package task_on_collection;
import java.util.*;
import java.util.Map.Entry;
class Medal
{
	HashMap<String,String> student1=new HashMap<String,String>();
	public HashMap<String,String> distribute(HashMap<String,Integer> student)
	{
			for (Entry<String, Integer> entry : student.entrySet())
			{
				String key=entry.getKey();
				int val = entry.getValue();
				if(val>=90)
				{
					student1.put(key,"Gold");
				}
				else if(val>=80 && val<90)
				{
					student1.put(key,"Silver");
				}
				else if(val >= 70 && val<80)
				{
					student1.put(key,"Bronze");
				}
				else
				{
					student1.put(key,"NoMedals");
				}
			}
			return student1;
	}
}


public class Question17 {
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> student=new HashMap<String,Integer>();
	
	public static void main(String...strings)
	{
		Question17 q17=new Question17();
		q17.input();
		System.out.println(q17.student);
		
		Medal m=new Medal();
		HashMap<String,String> student1=m.distribute(q17.student);
		System.out.println(student1);
		
	}
	
	public void input()
	{
		System.out.println("Enter The Number of Students do you have :- ");
		int noofstudent=sc.nextInt();
		for(int i=0;i<noofstudent;i++)
		{
		System.out.println("Enter The Regeistration number for student "+(i+1)+":- ");
		String Regn=sc.next();
		System.out.println("Enter Your mark from 100 for student "+(i+1)+":- ");
		int mark=sc.nextInt();
		student.put(Regn, mark);
		}
	}
}
