package divyapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_words_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="Raj kumar raj shiva kumar naresh suresh";
		   str= str.toLowerCase();
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		String original[]=str.split(" ");

		for(String c :original)
		{
		if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
				}
			else
			{
				map.put(c, 1);
			
			}
		}

		  
		Set<Map.Entry<String, Integer>> countSet = map.entrySet();
		for(Map.Entry<String, Integer> entry  : countSet)
		{
		  if(entry.getValue() > 1) 
		  {
		    System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
		  }
		}

		
		
	}

}
