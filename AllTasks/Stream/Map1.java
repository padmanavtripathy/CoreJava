package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Map1 {
	public static void main(String[] args) {
		List<Integer> number=new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		Iterator<Integer> itr=number.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		List<Integer> square=number.stream().map(x -> x*x).collect(Collectors.toList());
	}
}
