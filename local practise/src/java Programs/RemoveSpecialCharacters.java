package kumar;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/*
		 * String s = "Hello?@ Friends12, how, are ^you"; String
		 * newstring=s.replaceAll("[?@,^]", "");//excludes
		 * System.out.println("new string: "+newstring);
		 */
		
		 String s = "Java is a class-based1234, object-oriented %#!>programming #@ %language that is designed%^&.";
	        String newString=s.replaceAll("[^a-zA-Z,.]+"," ");//includes
	        String newString1=s.replaceAll("[^0-9]+"," ");//includes
	        String newString2=s.replaceAll("[^-?@,%#!>&^]+"," ");//includes
	        System.out.println(newString);
	        System.out.println(newString1);
	        System.out.println(newString2);
	}
	}