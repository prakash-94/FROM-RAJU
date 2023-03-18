package kumar;

public class StringPalindrome {
	public static void main(String[] args) {
		String str="Radar",reverseStr="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
		    reverseStr=reverseStr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseStr.toLowerCase()))
		{
		    System.out.println(str+" is palindrome string");
		}
		else
		{
		    System.out.println(str+" is not palindrome string");
		}
	}
}

