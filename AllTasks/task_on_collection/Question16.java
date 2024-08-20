package task_on_collection;
import java.util.*;
class Checker 
{
	public HashMap<String,String> check(HashMap<String,Float> hm)
	{
		HashMap<String,String> hm2=new HashMap<String,String>();
		for (Map.Entry<String,Float > entry : hm.entrySet()) {
			String key = entry.getKey();
			Float val = entry.getValue();
			if(val>60)
			{
				hm2.put(key, "pass");
			}
			else
			{
				hm2.put(key, "fail");
			}
			
		}
		return hm2;
	}
}
public class Question16 {
	
	public static void main(String...strings)
	{
		HashMap<String,Float> hm=new HashMap<String,Float>();
		hm.put("Selva",75.6f);
		hm.put("abi", 89.5f);
		hm.put("ram", 40f);
		
		System.out.println(hm);
		
		Checker ck=new Checker();
		HashMap<String,String> hm2=ck.check(hm);
		System.out.println(hm2);
	}
	
}
