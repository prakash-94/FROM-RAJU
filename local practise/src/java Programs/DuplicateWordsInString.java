package kumar;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Big black bug bit a big black dog on his bit big black nose"; 
str=str.toLowerCase();
String words[]=str.split(" ");
	int count;
	for(int i=0;i<words.length;i++)
	{
		count=0;
		for(int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
			count++;
			words[j]="0";
			}
		}
	if(count>0 && words[i]!="0")
	{
		System.out.println(words[i]);
	}
	}
	
	
	}
	}
