package task_on_collection;
import java.util.*;

public class Question3 {
	public static void main(String...strings)
	{
		String countryname[]= {"Afghanistan","Austria","Bangladesh","Bhutan","Brazil","China"};
		String[] capitals= {"Kabul","Vienna","Dhaka","Thimphu","Brasilia","Beijing"};
		Map<String,String> country=new HashMap<String,String>();
		for(int i=0;i<capitals.length;i++)
		{
			country.put(countryname[i], capitals[i]);
		}
		
//		1.foreach loop
		for(Map.Entry<String,String> entry: country.entrySet())
		{
			System.out.println("Key = "+entry.getKey()+"  ,      Values ="+entry.getValue());
		}
		
//		2.keyset iterator
		Iterator<String> itr=country.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println("Key = "+itr.next()+" ,  value = "+country.get(key));
		}
		
	}
}