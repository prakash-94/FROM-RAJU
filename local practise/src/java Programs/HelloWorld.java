package kumar;

public class HelloWorld {
	static int i = 1;
		public static void main(String[] args) {
			
			System.out.println(i);
			Dummy dummy=new Dummy();
			dummy.method1();
		}
	}

	class Dummy
	{
	   int j=10;
	   void method1()
	   {
		   System.out.println(j);
		   System.out.println(HelloWorld.i);
	   }
	}
