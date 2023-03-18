package kumar;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,firstterm=0,secondterm=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstterm+",");
			int nextterm=firstterm+secondterm;//0+1=1,1+1=2,1+2=3
			firstterm=secondterm;//1,1,2
			secondterm=nextterm;//1,2,3
		}
		

	}

}
