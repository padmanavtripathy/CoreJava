package task_on_collection;
import java.util.*;
class Sortbyprice implements Comparator<Product>
	{

		public int compare(Product o1, Product o2) {
			return o1 -  o2;
		}
}
public class Question9 {
	public static void main(String...strings)
	{
		int arr[]= {1,2,3,4,5,7,6,8,9};
		String str[]= {"One","Two","Three","Four","Five","Seven","six","Eight","Nine"};
		HashMap<Integer,String> tm=new HashMap<Integer,String>();
		for(int i=0;i<str.length;i++)
		{
			tm.put(arr[i],str[i]);
		}
		System.out.println("Before Sorting ........."+tm);
		Collections.sort(tm, compare());
		for(int i=0;i<tm.size();i++)
		{
			for(int j=0;j<tm.size();j++)
			{
				System.out.println();
			}
		}
		
	}
}
