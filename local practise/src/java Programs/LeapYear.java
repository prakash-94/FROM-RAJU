package kumar;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Year:");
	y=sc.nextInt();
	
	if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
	{
		System.out.println("It is Leap Year");
	}
	else
	{
		System.out.println("It is  Not Leap Year");
	}
	
	}
}