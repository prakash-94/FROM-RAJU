package divyapractise;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234,count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
	System.out.println("No.of Digits in given number: "+count);
	}

}
