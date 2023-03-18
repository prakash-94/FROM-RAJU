package divyapractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_SubSting {

	public static void main(String[] args) {
		LongestSubString("rmmkum");
	}
public static void LongestSubString(String s)
{
	String longestsubstring=null;
	int longestsubstringlength=0;
	Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		
		char ch=arr[i];
		if(ch==' ')
			continue;
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
		if(map.size()>longestsubstringlength)
		{
			longestsubstringlength=map.size();
			longestsubstring=map.keySet().toString();
		}
		}
	
	}
	System.out.println("Longest substring is: "+longestsubstring);
	System.out.println("Longest substring length is: "+longestsubstringlength);
	
	}
}
