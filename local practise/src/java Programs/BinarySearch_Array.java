package divyapractise;

import java.util.Arrays;

public class BinarySearch_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,30,20,50,40};
		Arrays.sort(arr);
		int first=0,last,key=40;
		last=arr.length-1;
		BinarySearch(arr,first,last,key);
		
	}
public static void BinarySearch(int arr[],int first,int last,int key)
{
	int mid=(first+last)/2;
	while(first<=last)
	{
		if(arr[mid]<key)
		{
			first=mid+1;
		}
		else if(arr[mid]==key)
		{
			System.out.println(key+"  is found at index position of "+mid);
			break;
		}
		else
		{
			last=mid-1;
		}
	mid=(first+last)/2;
	}
if(first>last)
{
System.out.println("key is not available in Array");	
}

	
	}
}
