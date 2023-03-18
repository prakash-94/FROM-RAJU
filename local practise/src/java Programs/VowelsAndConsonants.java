package kumar;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a really simple sentence";
		int VCount = 0, CCount = 0;
		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
					|| ch == 'u') {
				VCount++;
			} else if (ch >= 'a' && ch <= 'z')

			{
                    CCount++;
			}
		}
		System.out.println("Number of vowels: " + VCount);    
        System.out.println("Number of consonants: " + CCount); 
	}
}