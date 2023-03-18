package kumar;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "T    his is b  ett     er.";
		System.out.println("Sentence with whitespaces"+sentence);
	String newsentence=sentence.replaceAll(" ", "");
	System.out.println("Sentence without whitespaces"+newsentence);
	}
	
}
