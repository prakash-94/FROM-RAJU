package kumar;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=121,sum=0;
	int temp=num;
	while(num>0)
	{
		int r=num%10;
		sum=sum*10+r;
		num=num/10;
	}
	if (temp==sum)
	System.out.println("Given number is palindrome");
	
	else
	{
		System.out.println("Given number is not palindrome");
	}
}
}
