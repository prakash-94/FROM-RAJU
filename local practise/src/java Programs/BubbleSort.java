package divyapractise;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {10,30,20,50,40,70};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Given numbers are in Ascending Order: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
