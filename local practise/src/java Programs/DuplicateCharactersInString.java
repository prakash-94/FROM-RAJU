package kumar;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String str = "Great responsibility";    
	
	char str1[]=str.toCharArray();
	int count;
	System.out.println("Duplicate Characters in given String:");
	for(int i=0;i<str1.length;i++)
	{
		count=0;
		for(int j=i+1;j<str1.length;j++)
		{
			if(str1[i]==str1[j] && str1[i]!=' ' )
			{
				count++;
			
				str1[j]='0';
			}
		}
	if(count>0 && str1[i]!='0')
	{
		System.out.println(str1[i]);
	}
	}
	
	}
	}

