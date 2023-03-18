package kumar;

public class SumofDigitsInNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12156,sum=0;
while(num>0)
{
int r=num%10;
sum=sum+r;
num=num/10;
}
System.out.println("sum of digits in number is: "+sum);
	}

}
