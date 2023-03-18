package divyapractise;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=18667;int Evencount=0,Oddcount=0;
while(num>0)
{
int digit=num%10;

if(digit%2==0)
{
	Evencount++;
}
else
{
Oddcount++;	
}
num=num/10;
}
System.out.println("Even digits: " +Evencount+ " Odd digits: "  +Oddcount);
	}

}
