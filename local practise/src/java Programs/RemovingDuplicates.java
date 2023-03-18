package kumar;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.checkerframework.common.aliasing.qual.Unique;


public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberArray[]= {12,8,2,8,6,5,1,1,2,7};
		HashSet<Integer>Uniqueset=new HashSet<Integer>();
		HashSet<Integer>dupset=new HashSet<Integer>();
	for(int i=0;i<numberArray.length;i++)
	{
		if(!Uniqueset.add(numberArray[i]))
		{
			dupset.add(numberArray[i]);
		}
	}
		System.out.println("Duplicate Elements are:" +dupset+" \n");
		System.out.println("Without Duplicate Elements are:" +Uniqueset+" \n");
	Integer UniqueArray[]=Uniqueset.toArray(new Integer[Uniqueset.size()]);
	Arrays.sort(UniqueArray,Collections.reverseOrder());
System.out.println("Array without duplicate elements in Descending order:");
	for(int i=0;i<UniqueArray.length;i++)
	{
		System.out.print(UniqueArray[i]+" ");
	}
		/*  int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		  System.out.print("Duplicate elements in given array: "); //Searches forduplicate element 
		  for(int i = 0; i < arr.length; i++) 
		  {
			  for(int j = i + 1; j< arr.length; j++)
			  {
				  if(arr[i]== arr[j])
				  {
					  System.out.print(+arr[j]+",");
					
				  }
			
			  }

		} 
	
	int[] arr = new int[] { 5, 2, 8, 7, 1,1 };
		int temp = 0;

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
	
	
	
	}
	}


