package kumar;

public class StringIsNumeric {

	public static void main(String[] args) {

String str="1234";
boolean numeric=true;
try
{
	Double num=Double.parseDouble(str);
	
}catch(NumberFormatException e)
{
	numeric=false;
	
}
if(numeric)
	System.out.println(str+" is numeric");
else
	System.out.println(str+" is not numeric");
	}
	
}
