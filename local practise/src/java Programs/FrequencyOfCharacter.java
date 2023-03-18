package kumar;

import java.util.HashMap;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		/*String str = "picture perfect";  
		int[] freq = new int[str.length()];    
	          
	            
	        //Converts given string into character array    
	        char string[] = str.toCharArray();    
	            
	        for(int i = 0; i <str.length(); i++) 
	        {    
	            freq[i] = 1;    
	            for(int j = i+1; j <str.length(); j++)
	            {    
	                if(string[i] == string[j]) 
	                {    
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                    string[j] = '0';    
	                }    
	            }    
	        }    
	            
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(int i = 0; i <freq.length; i++) {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.println(string[i] + "-" + freq[i]);    
	        }    
	    }    
	}   */

String a = "eaaaababb bccd be";

HashMap<Character, Integer> map = new HashMap<Character, Integer>();
String original[]=a.split(" ");
for(String word:original)
{
for (int i = 0; i < word.length(); i++) {
    if (map.containsKey(word.charAt(i))) {
        int count = map.get(word.charAt(i)) + 1;
        map.put(word.charAt(i), count);
    } else 
    {
        map.put(word.charAt(i), 1);
    }
}
}
System.out.println(map);
}
}