package divyapractise;

import java.util.Arrays;

public class LinearSearch_Array {

	public static void main(String[] args) {
		
		int arr[]= {10,30,50,70,90,20};
		Arrays.sort(arr);
		int key=70;
		System.out.println(key+ "is found at index :"+LinearSearch(arr,key));
		
	}
public static int LinearSearch(int arr[],int key)
{
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]==key)
	{
	return i;	
	}

	}
	return-1;
}
}
