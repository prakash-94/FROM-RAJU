package kumar;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is Rajkumar";
		//Reverse a string without reverse function

/*	int size=str.length();
	char a[]=str.toCharArray();
	for(int i=size-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}*/
		
/*
 //print words in reverse
 * String splitArray[]=str.split(" "); int size=splitArray.length; for(int
 * i=size-1;i>=0;i--) { System.out.print(" "+splitArray[i]); }
 */
	

  //WAP words in order but chars in reverse
   String splitArray[]=str.split(" ");
  int size=splitArray.length; 
  for(int i=0;i<size;i++) 
  {
   char rev[]=splitArray[i].toCharArray(); 
   for(int j=rev.length-1;j>=0;j--) 
   {
  System.out.print(rev[j]); 
  }
   System.out.print(" "); 
   }
 
	
		//StringBuffer sb=new StringBuffer(str);	
		//String rev=sb.reverse().toString();
		//System.out.println(rev);
		

}

}