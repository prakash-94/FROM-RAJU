package divyapractise;

public class FibonocciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10,firstterm=0,secondterm=1,lastterm;
		for(int i=0;i<num;i++)
		{
			System.out.print(firstterm+" ");
			lastterm=(firstterm+secondterm);
		firstterm=secondterm;
		secondterm=lastterm;
		}
	}

}
