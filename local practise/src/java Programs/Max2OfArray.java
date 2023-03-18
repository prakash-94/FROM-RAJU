package kumar;

public class Max2OfArray {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {15,16,1,20,100,12,115,114};
		int maxOne=0,maxTwo=0,maxThree=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>maxOne)
			{
				maxTwo=maxOne;
				maxOne=num[i];
			}
			else if(num[i]>maxTwo)
			{
				maxThree=maxTwo;
				maxTwo=num[i];
			}
			else
			{
				maxThree=num[i];
			}
		
		}
		System.out.println(maxOne+ " "+maxTwo+" "+maxThree );
	}

}*/
public static int getThirdLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-3];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,21,25}; 
int total=a.length;
int b[]={44,66,99,77,33,22,55};  
System.out.println("Third Largest: "+getThirdLargest(a,total));  
System.out.println("Third Largest: "+getThirdLargest(b,7)); 
}
}
 