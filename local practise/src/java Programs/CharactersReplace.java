package kumar;

public class CharactersReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Great Power";   
		StringBuffer newStr=new StringBuffer(str1);
	for(int i=0;i<str1.length();i++)
	{
		char ch=str1.charAt(i);
	    if(Character.isLowerCase(ch))
		{
			newStr.setCharAt(i,Character.toUpperCase(ch));
		}
else 
	{
	  newStr.setCharAt(i,Character.toLowerCase(ch));
	}
	    
	}
	System.out.println("String after case conversion:" +newStr);
	}
}