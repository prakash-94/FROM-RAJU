package divyapractise;

public class DuplicateElement_Array {

	public static void main(String[] args) {
		
		int arr[]= {12,15,12,16,15,19};
		System.out.println("Duplicate elements in given array is:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]+" ");
				}
			}
		}
		
		
	}

}
