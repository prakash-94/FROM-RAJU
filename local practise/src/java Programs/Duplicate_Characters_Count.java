package divyapractise;

import java.util.*;

public class Duplicate_Characters_Count {

	public static void main(String[] args) {
		
		
		String str="aabc cb a cddaa baaf";
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		char newstr[]=str.toCharArray();
for(char c:newstr)
{
	if(c == ' ')
    continue;

	if(map.containsKey(c))
	{
		map.put(c, map.get(c)+1);
		}
	else
	{
		map.put(c, 1);
	
	}
}

  
Set<Map.Entry<Character, Integer>> countSet = map.entrySet();
for(Map.Entry<Character, Integer> entry  : countSet)
{
  if(entry.getValue() > 1) 
  {
    System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
  }
}

}

}
