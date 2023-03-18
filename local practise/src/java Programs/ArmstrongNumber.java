package kumar;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//153 is a armstrong number
	int num=153;
	int temp=num,armstrong=0;
	while(num>0)
	{
		int r=num%10;
		armstrong=armstrong+r*r*r;
		num=num/10;
	}
	if(temp==armstrong)
	{
		System.out.println("is armstrong");
	}
	else
	{
		System.out.println("is not armstrong");
	}
	}

}


	/*    int low = 999, high = 99999;

	    for(int number = low + 1; number < high; ++number) {
	      int digits = 0;
	      int result = 0;
	      int originalNumber = number;

	      // number of digits calculation
	      while (originalNumber != 0) {
	        originalNumber /= 10;
	        ++digits;
	      }

	      originalNumber = number;

	      // result contains sum of nth power of its digits
	      while (originalNumber != 0) {
	        int remainder = originalNumber % 10;
	        result += Math.pow(remainder, digits);
	        originalNumber= originalNumber/10;
	      }

	      if (result == number) {
	        System.out.print(number + " ");
	      }
	    }
	  }
	}*/