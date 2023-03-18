package divyapractise;

public class Duplicate_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aabc deabcef";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>0 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
		
		
		
	}

}
