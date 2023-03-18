package kumar;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "This website, is aw3som3.";
		line=line.toLowerCase();
		int vowels=0,consonants=0,digits=0,spaces=0;
		for(int i=0;i<line.length();i++)
		{
		char ch=line.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				vowels++;
			}
			else if(ch>='a' && ch<='z' )
			{
				consonants++;
			}
			else if(ch>='0' && ch<='9')
			{
			digits++;	
			}
			else
			{
				spaces++;
			}
		}
		System.out.println("nos.of vowels:" +vowels);
		System.out.println("nos.of consonants:" +consonants);	
		System.out.println("nos.of digits:" +digits);
		System.out.println("nos.of spaces:" +spaces);	
	}

	}


