package divyapractise;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Mas@ada!pu.raj%kum&ar123,*^,#";
		//String newstr=str.replaceAll("[@!%&*#,^.]", "");
String newstr=str.replaceAll("[^a-zA-Z0-9]+", "");
	System.out.println(newstr);	
	}

}
