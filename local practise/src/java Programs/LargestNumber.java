package kumar;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {25, 11, 7, 75, 56}; 
		  
		/*  int min=arr[0];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]<min)
			  {
				  min=arr[i];
			  }
		 
		  }
		  System.out.println("minimum number is:"+min);		*/  
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println("maximum number is:"+max);
	}

}
