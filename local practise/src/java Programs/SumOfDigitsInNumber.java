package divyapractise;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345,r,sum=0;
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);
	}

}
