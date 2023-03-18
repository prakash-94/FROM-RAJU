package divyapractise;

public class Move_zeros_toEnd {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 0, 5, 6, 0, 10 };
		int temp = 0;
		int j = 0;
		/*
		 * for(int i=0;i<arr.length;i++) 
		 * {
		 *  if(arr[i]!=0 && arr[j]==0) 
		 *  { 
		 *  temp=arr[i];
		 * arr[i]=arr[j]; 
		 * arr[j]=temp; 
		 * } 
		 * if(arr[j]!=0)
		 *  {
		 *   j++;
		 *   }
		 * }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 */

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && arr[j] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] == 0) {
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
