package kumar;

import java.util.Arrays;

public class BinarySearch {



	 public static void main(String args[]){
			int arr[] = {40,20,10,50,60,70};
			Arrays.sort(arr);//10,20,40,50,60,70
		int first=0,key=60;
		int last=arr.length-1;
		System.out.println(last);
		BinarySearch(arr,first,last,key);
	
	}
public static void BinarySearch(int arr[],int first,int last,int key) {
 int mid=(first+last)/2;
 while( first <= last ){

if(arr[mid]<key)
{
first=mid+1;	
}
else if(arr[mid]==key)
{
System.out.println("Index positon of key is:" +mid);	
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
	 System.out.println("Element is not found!");
}
}

}
