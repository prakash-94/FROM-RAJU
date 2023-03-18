package kumar;

public class DuplicateNumbers {

	public static void main(String[] args) {
			
		
		  int [] arr ={1, 2, 3, 4, 2, 7, 8, 8, 3};
		  System.out.print("Duplicate elements in given array: ");
		   //Searches for duplicate element 
		   for(int i = 0; i < arr.length; i++) 
		   { 
		   for(int j = i + 1;j< arr.length; j++) 
		   { if(arr[i] == arr[j]) 
		   {
		    System.out.print(+arr[j]+",");
		     }
		  
		  }
		  
		  }
		 
			 
			/*
			 * int[] arr = { 5, 2, 8, 7, 1 }; int temp = 0;
			 * 
			 * // Displaying elements of original array
			 * System.out.println("Elements of original array: "); for (int i = 0; i <
			 * arr.length; i++) { System.out.print(arr[i] + " "); }
			 * 
			 * // Sort the array in ascending order for (int i = 0; i < arr.length; i++) {
			 * for (int j = i + 1; j < arr.length; j++) { if (arr[i] > arr[j]) { temp =
			 * arr[i]; arr[i] = arr[j]; arr[j] = temp; } } }
			 * 
			 * System.out.println();
			 * 
			 * // Displaying elements of array after sorting
			 * System.out.println("Elements of array sorted in ascending order: "); for (int
			 * i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
			 */
		
	
		
				
		}
	}
