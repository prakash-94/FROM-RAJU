package divyapractise;

public class Factorial_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4;
factorial(num);		
	System.out.println(factorial(num));
	}
static int factorial(int num)
{
	if(num==0 || num==1)
	{
		return 1;
	}
	else
	return num*factorial(num-1);

}
}
