package kumar;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub int fact=1; int num=4; for(int
		 * i=1;i<=num;i++) { fact=fact*i; } System.out.println(fact);
		 */
	
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number: ");
int n=sc.nextInt();
//int result=factorialMethod(n);
Factorial f=new Factorial();
int result=f.factorialMethod(n);
System.out.println(result);
		
}
	
	public int factorialMethod(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
		int fact=n*factorialMethod(n-1);
		return fact;
		}
		
	}

}


/*
 * public class MultiplicationTable {
 * 
 * public static void main(String[] args) {
 * 
 * int num = 5; for(int i = 1; i <= 10; ++i) {
 * System.out.printf("%d * %d = %d\n", num, i, num * i); } } }
 */
 
