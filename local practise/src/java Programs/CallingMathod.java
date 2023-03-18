package kumar;

public class CallingMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=12;
		int num2=7;
		int answer1;
		int answer2;
		boolean answer3;
		answer1=multNumber(num1);
		answer2=addNumber(num1,num2);
		answer3=equalNumbers(num1,num2);
		
	System.out.println("When we multiply num by 7 we get:" +answer1);
	System.out.println("When we add two numbers we get:" +answer2);
	System.out.println("When num1 and num2 equal we get: " +answer3);

	}
	

static int multNumber(int a)
{

return (a*7);
}
 static int addNumber(int x,int y)
{
	return(x+y);

}
static boolean equalNumbers(int r,int t)
{
	if(r==t) return true;
	else return false;
}
static
{
System.out.println("ravi");	
}

}

