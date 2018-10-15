import java.util.Scanner;
public class CS210_LAB2_COLATZ_CONJECTURE
 {

    public static void main(String args[])
    {
    	// The longest number I could find is 922370904968134656 from 17428946 changed to 17429946 and it runs 321 times.
    	Scanner sc= new Scanner(System.in);
    	 	long n = sc.nextLong();
    	 	collatz(n);
    }
    public static void collatz(long n) {
  int i = 0;
  while (n > 1)
  {
     if(n % 2 == 0)
     {
     	n=n/2;
     }
      else
      {
        n=3 * n+1;
      }

     i++;
   }
  System.out.println("The length of the collatz conjecture sequence is: "+i);
}


}