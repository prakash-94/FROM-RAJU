package divyapractise;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Radar";
		str=str.toLowerCase();
		String reverse="";
		int size=str.length();
		for(int i=size-1;i>=0;i--)
		{
		    reverse=reverse+str.charAt(i);
		}
		    if(str.equals(reverse))
		    {
		        System.out.println("Given string is palindrome");
		    }
		    else
		    {
		        System.out.println("Given string is not palindrome");
		    }
	}

}
