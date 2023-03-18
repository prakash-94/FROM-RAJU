package kumar;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int n=sc.nextInt();
		int count=0;
		/*
		 * int m=n/2; if(n==0 || n==1 ) { System.out.print("Entered number not prime");
		 * 
		 * } else { for(int i=2;i<=m;i++) { if (n % i == 0) { count++;
		 * System.out.print("Entered number not prime"); break; } } if(count==0) {
		 * System.out.print("Entered number prime"); } }
		 */
		 
	System.out.println("The prime Numbers are:");	
	for(int i=2;i<=n;i++)
	{
	count=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			count++;
			break;
		}
	}
	if(count==0)
	{
		System.out.print(i+" ");
	}
	
	}
		
		 
		}
}
