package divyapractise;

import java.util.ArrayList;
import java.util.List;

public class EvenAndOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,4,3,5,7,8};
		System.out.println("Odd Numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Even numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		/*
		 * List<Integer> Even_Numbers=new ArrayList<Integer>(); List<Integer>
		 * Odd_Numbers=new ArrayList<Integer>(); for(int i=0;i<arr.length;i++) {
		 * if(arr[i]%2==0) { Even_Numbers.add(arr[i]); } else { Odd_Numbers.add(arr[i]);
		 * } } System.out.println(" Even numbers are:" +Even_Numbers);
		 * System.out.println(" Odd numbers are:" +Odd_Numbers);
		 */
		}
		

}
