package divyapractise;

public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Raj is a good boy";
		String newstr[]=str.split(" ");
		int WCount=0;
		for(int i=0;i<newstr.length;i++)
		{
			WCount++;
		}
	System.out.println("No.of Words in a String is: "+WCount);
	}

}
