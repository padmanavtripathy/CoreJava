package task_on_collection;
import java.util.*;

public class Question_2 {
	public static void main(String...strings)
	{
		String[] str= {"one","two","three","four","five","six","seven","Eight","nine","ten"};
		
		List<String> a1=new ArrayList<String>();
//Q-a		Step-1
//		for(int i=0;i<str.length;i++)
//		{
//			a1.add(str[i]);
//		}
//		System.out.println(a1);
		
////		step-2
		Collections.addAll(a1,str);
//		System.out.println(a1);
		
		
//		//step-3
//		List a3 =Arrays.asList(str);
//		System.out.println(a3);
		
		
//Q-b		//ArrayList to Array
		String[] arr=new String[a1.size()];
		arr=a1.toArray(arr);
		
	}
}
