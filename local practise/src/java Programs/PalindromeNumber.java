package divyapractise;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,r,reverse=0,temp=num;
		while(num>0)
		{
		    r=num%10;
		    reverse=reverse*10+r;
		    num=num/10;
		}
		if(temp==reverse)
		{
		    System.out.println("Given number is palindrome");
		}
		else
		{
		    System.out.println("Given number is not palindrome");
		}
	}

}
