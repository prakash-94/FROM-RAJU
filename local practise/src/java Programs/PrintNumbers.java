package kumar;

public class PrintNumbers {

    // Prints numbers from 1 to n
     static void printNos(int n)
    {
        if(n<=5)
        {
           
            System.out.print(n + " ");
            printNos(n+1);
        }
   
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        printNos(1);
    }
}
 
