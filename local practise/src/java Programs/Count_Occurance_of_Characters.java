package divyapractise;

import java.util.*;

public class Count_Occurance_of_Characters {

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

System.out.println(map);
}

}
