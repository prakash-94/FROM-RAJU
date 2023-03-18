package divyapractise;

public class Fibonacci_Recursion {

	static int n1=0,n2=1,n3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=10;
		System.out.print(n1+" "+n2+" ");
Fibonacci_Recursion fr=new Fibonacci_Recursion();
fr.printFib(count-2);
		
	}
void printFib(int count)
{
	if(count>0)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		printFib(count-1);
	}
	
	}
}
