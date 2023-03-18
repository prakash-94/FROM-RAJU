package divyapractise;

public class MaxAndMin_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {20,10,50,70,40};int max=arr[0],min=arr[0];
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
	}
	else if(arr[i]<min)
	{
		min=arr[i];
	}
}
	System.out.println("max value is:"+max);
	System.out.println("min value is:"+min);
	}

}
