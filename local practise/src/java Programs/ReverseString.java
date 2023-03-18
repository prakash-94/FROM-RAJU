package divyapractise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="MY name is Rajkumar";


/*
 * StringBuffer sb = new StringBuffer(str); sb.reverse();
 * System.out.println(sb);
 */

/*
 * int size=str.length();String reverse=""; for(int i=size-1;i>=0;i--) {
 * reverse=reverse+str.charAt(i); } System.out.println(reverse);
 */

/*
 * char ch[]=str.toCharArray(); int size=ch.length; for(int i=size-1;i>=0;i--) {
 * System.out.print(ch[i]+""); }
 */


/*
 * String newstr[]=str.split(" "); int size=newstr.length; for(int
 * i=size-1;i>=0;i--) { System.out.print(newstr[i]+" "); }
 */


String newstr[]=str.split(" ");
int size=newstr.length;
for(int i=0;i<size;i++)
{
	char rev[]=newstr[i].toCharArray();
	for(int j=rev.length-1;j>=0;j--)
	{
		System.out.print(rev[j]);
	}
	System.out.print(" ");
}
	
	}

}
